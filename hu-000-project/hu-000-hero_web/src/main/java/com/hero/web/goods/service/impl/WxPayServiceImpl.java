//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.hero.web.goods.service.impl;

import com.github.wxpay.sdk.WXPay;
import com.hero.common.pojo.Order;
import com.hero.web.goods.service.OrderService;
import com.hero.web.goods.service.WxPayService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxPayServiceImpl implements WxPayService {
    @Autowired
    private WXPay wxPay;
    @Autowired
    OrderService orderService;
    private String notifyUrl;

    public WxPayServiceImpl() {
    }

    public Map nativePay(String orderId) {
        Order order = this.orderService.findById(orderId);

        try {
            Map<String, String> map = new HashMap();
            map.put("body", "京南商城商城");
            map.put("out_trade_no", order.getId());
            map.put("total_fee", "1");
            map.put("spbill_create_ip", "127.0.0.1");
            map.put("notify_url", this.notifyUrl);
            map.put("trade_type", "NATIVE");
            Map<String, String> mapResult = this.wxPay.unifiedOrder(map);
            mapResult.put("orderId", order.getId());
            mapResult.put("payMoney", String.valueOf(order.getPayMoney()));
            return mapResult;
        } catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public Map queryOrder(String orderId) {
        Map map = new HashMap();
        map.put("out_trade_no", orderId);

        try {
            return this.wxPay.orderQuery(map);
        } catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }
}
