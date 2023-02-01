package com.hero.web.order.controller;

import com.hero.common.entity.Result;
import com.hero.common.pojo.Address;
import com.hero.common.pojo.Order;
import com.hero.web.goods.service.AddressService;
import com.hero.web.goods.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/worder"})
public class WebOrderController {
  @Autowired
  AddressService addressService;
  
  @Autowired
  OrderService orderService;
  
/* 35 */   private String username = "sunwukong";
  
  public static final String URL = "http://web.jn.com:9001";
  
  @RequestMapping({"/ready"})
  public String readyOrder(Model model) {
/* 43 */     Result<List<Address>> addressList = this.addressService.list(this.username);
/* 44 */     Address defaultAddress = null;
/* 45 */     if (addressList.getData() != null)
/* 46 */       for (Address address : addressList.getData()) {
/* 47 */         if ("1".equals(address.getIsDefault()))
/* 48 */           defaultAddress = address; 
      }  
/* 51 */     model.addAttribute("addressList", addressList.getData());
/* 53 */     model.addAttribute("defaultAddress", defaultAddress);
/* 54 */     return "order";
  }
  
  @PostMapping({"/submit"})
  public String submit(Order order) {
/* 61 */     order.setUsername(this.username);
/* 70 */     return "fail";
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/order/controller/WebOrderController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */