package com.hero.web.goods.dao;

import com.hero.common.pojo.Spu;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface SpuMapper extends Mapper<Spu> {
  @Select({"select sp.id,sp.name,sp.images,sp.image from tb_spu sp where id=#{spuId} "})
  Spu queryBySpuid(String paramString);
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/dao/SpuMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */