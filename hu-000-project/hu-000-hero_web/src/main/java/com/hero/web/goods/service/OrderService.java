package com.hero.web.goods.service;

import com.hero.common.pojo.Order;

public interface OrderService {
  Order findById(String paramString);
  
  void updateOrderPayStatus(String paramString1, String paramString2);
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/service/OrderService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */