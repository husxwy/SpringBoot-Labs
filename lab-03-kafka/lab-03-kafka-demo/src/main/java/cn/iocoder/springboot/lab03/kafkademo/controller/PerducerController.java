package cn.iocoder.springboot.lab03.kafkademo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 发送topic测试数据值topic
 *
 * @author baiyan
 * @date 2022/01/19
 */
@RestController
@RequestMapping
public class PerducerController {

    @Autowired
    KafkaTemplate kafkaTemplate;

    @GetMapping
    public void send(String topicName,int msgNum) throws JsonProcessingException {
       long task = System.currentTimeMillis();
        if(StringUtils.isEmpty(topicName)){
            topicName = "test";
        }
        Optional.ofNullable(msgNum).orElse(1);
        for (int i = 0; i < msgNum; i++) {
            Map<String,Object> msg= new HashMap<>();
            msg.put("id",i);
            msg.put("task",task);
            msg.put("time", System.currentTimeMillis());
            ObjectMapper mapper = new ObjectMapper();
            StringBuilder sb = new StringBuilder();
            String keyStr = String.valueOf(sb.append(task).append(i));
//            System.out.println(keyStr);
//            Integer key = Integer.valueOf(keyStr);
            kafkaTemplate.send(topicName, keyStr, mapper.writeValueAsString(msg));
        }
    }

}
