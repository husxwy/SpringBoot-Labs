package com.example.jmhtest.util;

/**
 * @author whx
 * @date 2022/7/22
 */
public class OrderUtil {

    public static String list(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "order list";
    }

}
