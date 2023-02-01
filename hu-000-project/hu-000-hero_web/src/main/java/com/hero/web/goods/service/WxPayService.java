package com.hero.web.goods.service;

import java.util.Map;

public interface WxPayService {
  Map nativePay(String paramString);
  
  Map queryOrder(String paramString);
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/service/WxPayService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */