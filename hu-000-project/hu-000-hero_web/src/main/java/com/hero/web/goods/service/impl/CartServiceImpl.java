package com.hero.web.goods.service.impl;

import com.hero.common.util.IdWorker;
import com.hero.web.goods.service.CartService;
import com.hero.web.goods.service.SkuService;
import com.hero.web.goods.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImpl implements CartService {
  @Autowired
  SpuService spuService;
  
  @Autowired
  SkuService skuService;
  
  @Autowired
  IdWorker idWorker;
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/service/impl/CartServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */