package com.hero.web.goods.service;

import com.github.pagehelper.Page;
import com.hero.common.pojo.Sku;
import java.util.List;
import java.util.Map;

public interface SkuService {
  List<Sku> findBySpuId(String paramString);
  
  List<Sku> findList(Map<String, Object> paramMap);
  
  Sku findOneByskuId(String paramString);
  
  void decrCount(String paramString, Integer paramInteger);
  
  void incrCount(String paramString, Integer paramInteger);
  
  List<Sku> findAll();
  
  Sku findById(String paramString);
  
  void add(Sku paramSku);
  
  void update(Sku paramSku);
  
  void delete(String paramString);
  
  Page<Sku> findPage(int paramInt1, int paramInt2);
  
  Page<Sku> findPage(Map<String, Object> paramMap, int paramInt1, int paramInt2);
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/service/SkuService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */