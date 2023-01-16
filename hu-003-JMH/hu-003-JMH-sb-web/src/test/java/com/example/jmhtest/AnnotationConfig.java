package com.example.jmhtest;

import com.example.jmhtest.util.UserUtil;
import org.springframework.context.annotation.*;

/**
 * @author whx
 * @date 2022/7/22
 */
@Configuration
@ComponentScan(value = {"com.example.jmhtest"})
// 注意该配置文件不能为yml格式，否则会无法读取
@PropertySource("classpath:/jmh/application-jmh.properties")
public class AnnotationConfig {

    @Bean
    public UserUtil userUtil(){
        return new UserUtil();
    }



//    @Bean
//    @Profile("dev")
//    void dev(){
//
//    }
//
//    @Bean
//    @Profile("test")
//    void test(){
//
//    }

}
