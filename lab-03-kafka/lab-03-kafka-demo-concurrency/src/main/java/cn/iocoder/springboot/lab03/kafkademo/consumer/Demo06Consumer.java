package cn.iocoder.springboot.lab03.kafkademo.consumer;

import cn.iocoder.springboot.lab03.kafkademo.message.Demo06Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * concurrency 大于分区个数时，也只有 分区个数线程消费
 *   小于个数时，按照配置线程数消费
 */
@Component
public class Demo06Consumer {

    private Logger logger = LoggerFactory.getLogger(getClass());

    Set a  = new HashSet();

    @KafkaListener(topics = Demo06Message.TOPIC,
            groupId = "demo06-consumer-group-" + Demo06Message.TOPIC,
            concurrency = "1")
    public void onMessage(Demo06Message message) {
        logger.info("[onMessage][线程编号:{} 消息内容：{}]", Thread.currentThread().getId(), message);

        a.add(Thread.currentThread().getId());
        logger.info("消费线程个数 {}, 线程Id {}",a.size(),a);
    }

}
