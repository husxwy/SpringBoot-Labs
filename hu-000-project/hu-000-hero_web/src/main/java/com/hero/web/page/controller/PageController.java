package com.hero.web.page.controller;

import com.hero.common.entity.Result;
import com.hero.web.page.service.PageService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/page"})
public class PageController {
  @Autowired
  private PageService pageService;
  
/* 29 */   String username = "sunwukong";
  
  @GetMapping({"/createHtml/{spuId}"})
  public Result messageHandler(@PathVariable("spuId") String spuId) throws Exception {
/* 40 */     Map<String, Object> dataMap = this.pageService.findPageAllDataBySpuId(spuId);
/* 42 */     this.pageService.createStaticPage(dataMap, spuId);
/* 44 */     return Result.builder().code(Integer.valueOf(20000)).message("success").build();
  }
  
  @GetMapping({"/addCart/{skuId}/{num}"})
  public String addCartReturnPage(@PathVariable("skuId") String skuId, @PathVariable("num") Integer num, Model model) {
/* 63 */     return "success-cart";
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/page/controller/PageController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */