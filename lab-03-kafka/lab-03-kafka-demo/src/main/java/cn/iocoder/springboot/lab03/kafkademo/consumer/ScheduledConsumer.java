package cn.iocoder.springboot.lab03.kafkademo.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling

public class ScheduledConsumer {

        private static final Logger log= LoggerFactory.getLogger(ScheduledConsumer.class);

        @Autowired
        private KafkaListenerEndpointRegistry registry;

        @Autowired
        private ConsumerFactory consumerFactory;

        private long stopTime = 0;

        @Bean
        public ConcurrentKafkaListenerContainerFactory delayContainerFactory() {
            ConcurrentKafkaListenerContainerFactory container = new ConcurrentKafkaListenerContainerFactory();
            container.setConsumerFactory(consumerFactory);
            //禁止自动启动
            container.setAutoStartup(false);
            return container;
        }

        @KafkaListener(id = "durable", topics = "test.delay",groupId ="test.delay" ,containerFactory = "delayContainerFactory")
        public void durableListener(ConsumerRecord consumerRecord) {
            //这里做数据持久化的操作
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            log.info("topic.quick.durable receive : " + consumerRecord);
        }
//
//// TODO spring.kafka.consumer.max-poll-records 需要调整，拉取的同一批消息没有 ask 会继续执行完成才能 关闭监听
//        //定时器，每天凌晨0点开启监听
//        @Scheduled(fixedRate = 90000)
//        public void startListener() {
//            long startTime= System.currentTimeMillis();
//            log.info("开启监听 id durable");
//            //判断监听容器是否启动，未启动则将其启动
//            if (!registry.getListenerContainer("durable").isRunning()) {
//                registry.getListenerContainer("durable").start();
//            }
//            registry.getListenerContainer("durable").resume();
//
////            while(System.currentTimeMillis() - startTime == 30000){
////                log.info("关闭监听  id durable");
////                registry.getListenerContainer("durable").pause();
////            }
//
//        }
//
//        //定时器，每天早上10点关闭监听
//        @Scheduled(fixedRate = 60000)
//        public void shutDownListener() {
//            log.info("关闭监听  id durable");
//
//            registry.getListenerContainer("durable").pause();
//        }


    @KafkaListener(id = "durable2", topics = "test.delay",groupId ="test.delay.cron" ,containerFactory = "delayContainerFactory")
    public void durableListener2(ConsumerRecord consumerRecord) {
        //这里做数据持久化的操作
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("topic.quick.durable receive cron : " + consumerRecord);
    }

    @Scheduled(cron = "${jobs.sendGasJob.start.corn:0 */1 * * * ?}")
    public void startListener2() {
        long startTime= System.currentTimeMillis();

        log.info("test start, stopTime {}  {}  {} {}",stopTime,startTime,startTime - stopTime,registry.getListenerContainer("durable2").isRunning());
//        防止刚关闭就启动
        //判断监听容器是否启动，未启动则将其启动
        if (!registry.getListenerContainer("durable2").isRunning() && startTime - stopTime >= 60000) {
            registry.getListenerContainer("durable2").start();
            log.info("开启监听 id durable2 cron");
        }
        registry.getListenerContainer("durable2").resume();

//            while(System.currentTimeMillis() - startTime == 30000){
//                log.info("关闭监听  id durable");
//                registry.getListenerContainer("durable").pause();
//            }

    }

    //如果获取不到, 取冒号后面的默认值
//    @Scheduled(cron =  "${jobs.sendGasJob.corn:0/60 * * * * ?}")
    //定时器，每天早上10点关闭监听
//    @Scheduled(cron = "")
    @Scheduled(cron =  "${jobs.sendGasJob.stop.corn:0 */3 * * * ?}")
    public void shutDownListener2() {

        stopTime = System.currentTimeMillis();
//         只是 pause 会有问题
        registry.getListenerContainer("durable2").stop();

//        Pause this container before the next poll().

        registry.getListenerContainer("durable2").pause();

        log.info("关闭监听  id durable2 cron stopTime {}",stopTime);
        log.info("stopTime {}  {}  ",stopTime,registry.getListenerContainer("durable2").isRunning());


    }

    }
