package com.hero.web.goods.dao;

import com.hero.common.pojo.Brand;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface BrandMapper extends Mapper<Brand> {
  @Select({"select * from tb_brand where id in (select brand_id from tb_category_brand where category_id in (select id from tb_category where name = #{cateName}))"})
  List<Brand> findByCateName(@Param("cateName") String paramString);
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/dao/BrandMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */