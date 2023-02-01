package com.hero.web.order.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/wcart"})
public class WebCartController {
/* 21 */   String username = "sunwukong";
  
  public static final String URL = "http://web.jn.com:9001";
  
  @GetMapping({"/list"})
  public String list(Model model) {
/* 30 */     model.addAttribute("user", this.username);
/* 31 */     return "cart";
  }
  
  @GetMapping({"/add"})
  public String add(String skuId, Integer num) {
/* 39 */     return "redirect:http://web.jn.com:9001/wcart/list";
  }
  
  @GetMapping({"/del"})
  public String delete(@Param("skuId") String skuId) {
/* 47 */     return "redirect:http://web.jn.com:9001/wcart/list";
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/order/controller/WebCartController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */