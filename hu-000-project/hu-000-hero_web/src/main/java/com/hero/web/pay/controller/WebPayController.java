package com.hero.web.pay.controller;

import com.github.wxpay.sdk.WXPayUtil;
import com.hero.web.goods.service.OrderService;
import com.hero.web.goods.service.WxPayService;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.IOUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/wpay"})
public class WebPayController {
  @Autowired
  WxPayService wxPayService;
  
  @Autowired
  OrderService orderService;
  
/* 33 */   private String userName = "sunwukong";
  
  @GetMapping({"/nativePay"})
  public String wxPay(Model model, @Param("orderId") String orderId) {
/* 40 */     Map map = this.wxPayService.nativePay(orderId);
/* 41 */     model.addAttribute("orderId", map.get("orderId"));
/* 42 */     model.addAttribute("payMoney", Double.valueOf(Double.parseDouble(map.get("payMoney").toString())));
/* 43 */     model.addAttribute("code_url", map.get("code_url"));
/* 44 */     return "wxpay";
  }
  
  @RequestMapping({"/notify"})
  @ResponseBody
  public Map notify(HttpServletRequest request) throws Exception {
/* 53 */     System.out.println("==================接收到支付回调数据==========================");
    try {
/* 55 */       ServletInputStream inputStream = request.getInputStream();
/* 56 */       String xml = new String(IOUtils.toByteArray((InputStream)inputStream));
/* 57 */       Map<String, String> resultMap = WXPayUtil.xmlToMap(xml);
/* 59 */       this.orderService.updateOrderPayStatus(resultMap.get("out_trade_no"), resultMap.get("transaction_id"));
/* 61 */       System.out.println("发消息到页面：" + (String)resultMap.get("out_trade_no"));
/* 64 */       Map<Object, Object> map = new HashMap<>();
/* 65 */       map.put("return_code", "SUCCESS");
/* 66 */       map.put("return_msg", "OK");
/* 67 */       return map;
/* 68 */     } catch (Exception e) {
/* 69 */       System.out.println(e);
/* 72 */       return null;
    } 
  }
  
  @GetMapping({"/paysucces"})
  public String paySuccess(@Param("payMoney") Double payMoney, Model model) {
/* 77 */     System.out.println(payMoney);
/* 78 */     model.addAttribute("payMoney", payMoney);
/* 79 */     return "paysuccess";
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/pay/controller/WebPayController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */