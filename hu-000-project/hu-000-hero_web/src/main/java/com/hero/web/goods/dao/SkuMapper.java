package com.hero.web.goods.dao;

import com.hero.common.pojo.Sku;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

public interface SkuMapper extends Mapper<Sku> {
  Sku selectById(String paramString);
  
  @Update({"update tb_sku set num = num - #{num}, sale_num = sale_num + #{num} where id=#{skuId} and num >= #{num}"})
  void decrCount(@Param("skuId") String paramString, @Param("num") Integer paramInteger);
  
  @Update({"update tb_sku set num = num + #{num}, sale_num = sale_num - #{num} where id=#{skuId}"})
  void incrCount(@Param("skuId") String paramString, @Param("num") Integer paramInteger);
  
  @Select({"select sk.id, sk.name,sk.image,sk.images,sk.price from tb_sku sk where sk.spu_id=#{spuId} ;"})
  List<Sku> querySkusByspuId(String paramString);
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/dao/SkuMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */