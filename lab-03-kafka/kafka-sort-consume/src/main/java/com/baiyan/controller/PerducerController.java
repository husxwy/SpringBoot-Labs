package com.baiyan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        if(StringUtils.isEmpty(topicName)){
            topicName = "test";
        }
        Optional.ofNullable(msgNum).orElse(1);
        for (int i = 0; i < msgNum; i++) {
            Map<String,Object> msg= new HashMap<>();
            msg.put("id",i);
            msg.put("time", System.currentTimeMillis());
            ObjectMapper mapper = new ObjectMapper();
            kafkaTemplate.send(topicName, mapper.writeValueAsString(msg));
        }
    }

}
