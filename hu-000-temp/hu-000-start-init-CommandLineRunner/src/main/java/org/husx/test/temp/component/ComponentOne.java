package org.husx.test.temp.component;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ComponentOne implements CommandLineRunner {

    public ComponentOne() {
        log.info("CommandLineRunner 初始化");
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("CommandLineRunner 模拟耗时逻辑开始");
        try {
            //这里休眠5秒模拟耗时逻辑
            Thread.sleep(1000 * 60);
        } catch (InterruptedException e) {
            log.info("模拟逻辑耗时失败", e);
        }
        log.info("CommandLineRunner 模拟耗时逻辑完成");
    }
}
