package com.hero;


import com.github.wxpay.sdk.WXPay;
import com.github.wxpay.sdk.WXPayConfig;
import com.github.wxpay.sdk.WeChatPayConfig;
import com.hero.common.util.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.hero.web.goods.dao", "com.hero.web.business.dao", "com.hero.web.pay.dao", "com.hero.web.seckill.dao", "com.hero.web.user.dao"})
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(com.hero.WebApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1L, 1L);
    }

    @Bean
    public WXPay wxPay() {
        try {
            return new WXPay((WXPayConfig)new WeChatPayConfig());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
