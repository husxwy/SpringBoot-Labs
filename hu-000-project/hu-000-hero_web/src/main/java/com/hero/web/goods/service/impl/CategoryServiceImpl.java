package com.hero.web.goods.service.impl;

import com.hero.common.pojo.Category;
import com.hero.web.goods.dao.CategoryMapper;
import com.hero.web.goods.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
  @Autowired
  private CategoryMapper categoryMapper;
  
  public Category findOneById(Integer id) {
/* 20 */     return (Category)this.categoryMapper.selectByPrimaryKey(id);
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/service/impl/CategoryServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */