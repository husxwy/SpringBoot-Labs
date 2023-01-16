package com.example.jmhtest.util;

/**
 * @author whx
 * @date 2022/7/22
 */
public class UserUtil {

    public String list(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "user list";
    }
}
