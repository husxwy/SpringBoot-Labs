package com.hero.web.goods.service;

import com.hero.common.entity.Page;
import com.hero.common.pojo.Goods;
import com.hero.common.pojo.Spu;
import java.util.List;
import java.util.Map;

public interface SpuService {
  List<Spu> findAll();
  
  Spu findById(String paramString);
  
  void add(Spu paramSpu);
  
  void update(Spu paramSpu);
  
  void delete(String paramString);
  
  List<Spu> findList(Map<String, Object> paramMap);
  
  Page<Spu> findPage(int paramInt1, int paramInt2);
  
  Page<Spu> findPage(Map<String, Object> paramMap, int paramInt1, int paramInt2);
  
  void addGoods(Goods paramGoods);
  
  Goods findBySpuId(String paramString);
  
  void updateGoods(Goods paramGoods);
  
  void auditGoods(String paramString);
  
  void upGoods(String paramString);
  
  void downGoods(String paramString);
  
  void deleteLogic(String paramString);
  
  void restore(String paramString);
  
  void deleteGoods(String paramString);
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/service/SpuService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */