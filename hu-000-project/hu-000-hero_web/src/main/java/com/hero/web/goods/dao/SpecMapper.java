package com.hero.web.goods.dao;

import com.hero.common.pojo.Spec;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface SpecMapper extends Mapper<Spec> {
  @Select({"select * from tb_spec where template_id in (select template_id from tb_category where name = #{cateName})"})
  List<Spec> findByCateName(@Param("cateName") String paramString);
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/dao/SpecMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */