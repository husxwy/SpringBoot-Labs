package com.example.jmhtest.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author whx
 * @date 2022/7/22
 */
@RestController
@RequestMapping("order")
@Component("orderController")
public class OrderController {

    @GetMapping("list")
    public String list(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "order";
    }
}
