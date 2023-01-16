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
@RequestMapping("user")
@Component("userController")
public class UserController {

    @GetMapping("list")
    public String list(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "user";
    }
}
