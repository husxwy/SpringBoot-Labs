package org.husx.test.temp.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
//设置ComponentOne的初始化顺序在ComponentTwo之前
@Order(Ordered.HIGHEST_PRECEDENCE + 1)
public class ComponentTwo {

    public ComponentTwo() {
        log.info("ComponentTwo 初始化完成");
    }

    @PostConstruct
    public void init() {
        log.info("ComponentTwo 初始化完成后处理");
    }
}