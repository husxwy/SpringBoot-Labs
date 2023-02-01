/*     */ package com.hero.web.goods.service.impl;
/*     */ 
/*     */ import com.github.pagehelper.Page;
/*     */ import com.github.pagehelper.PageHelper;
/*     */ import com.hero.common.pojo.Sku;
/*     */ import com.hero.web.goods.dao.SkuMapper;
/*     */ import com.hero.web.goods.service.SkuService;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Service;
/*     */ import tk.mybatis.mapper.entity.Example;
/*     */ 
/*     */ @Service
/*     */ public class SkuServiceImpl implements SkuService {
/*     */   @Autowired
/*     */   private SkuMapper skuMapper;
/*     */   
/*     */   public List<Sku> findBySpuId(String spuId) {
/*  25 */     Map<String, Object> searchMap = new HashMap<>();
/*  26 */     searchMap.put("spuId", spuId);
/*  27 */     List<Sku> list = findList(searchMap);
/*  28 */     return list;
/*     */   }
/*     */   
/*     */   public List<Sku> findList(Map<String, Object> searchMap) {
/*  37 */     Example example = createExample(searchMap);
/*  38 */     return this.skuMapper.selectByExample(example);
/*     */   }
/*     */   
/*     */   public List<Sku> findAll() {
/*  46 */     return this.skuMapper.selectAll();
/*     */   }
/*     */   
/*     */   public Sku findById(String id) {
/*  51 */     return this.skuMapper.selectById(id);
/*     */   }
/*     */   
/*     */   public void add(Sku sku) {
/*  56 */     this.skuMapper.insert(sku);
/*     */   }
/*     */   
/*     */   public void update(Sku sku) {
/*  61 */     this.skuMapper.updateByPrimaryKey(sku);
/*     */   }
/*     */   
/*     */   public void delete(String id) {
/*  66 */     this.skuMapper.deleteByPrimaryKey(id);
/*     */   }
/*     */   
/*     */   public Page<Sku> findPage(int page, int size) {
/*  77 */     PageHelper.startPage(page, size);
/*  78 */     return (Page<Sku>)this.skuMapper.selectAll();
/*     */   }
/*     */   
/*     */   public Page<Sku> findPage(Map<String, Object> searchMap, int page, int size) {
/*  90 */     PageHelper.startPage(page, size);
/*  91 */     Example example = createExample(searchMap);
/*  92 */     return (Page<Sku>)this.skuMapper.selectByExample(example);
/*     */   }
/*     */   
/*     */   public Sku findOneByskuId(String id) {
/*  98 */     return (Sku)this.skuMapper.selectByPrimaryKey(id);
/*     */   }
/*     */   
/*     */   public void decrCount(String skuId, Integer num) {
/* 103 */     this.skuMapper.decrCount(skuId, num);
/*     */   }
/*     */   
/*     */   public void incrCount(String skuId, Integer num) {
/* 108 */     this.skuMapper.incrCount(skuId, num);
/*     */   }
/*     */   
/*     */   private Example createExample(Map<String, Object> searchMap) {
/* 116 */     Example example = new Example(Sku.class);
/* 117 */     Example.Criteria criteria = example.createCriteria();
/* 118 */     if (searchMap != null) {
/* 120 */       if (searchMap.get("id") != null && !"".equals(searchMap.get("id")))
/* 121 */         criteria.andEqualTo("id", searchMap.get("id")); 
/* 124 */       if (searchMap.get("sn") != null && !"".equals(searchMap.get("sn")))
/* 125 */         criteria.andEqualTo("sn", searchMap.get("sn")); 
/* 128 */       if (searchMap.get("name") != null && !"".equals(searchMap.get("name")))
/* 129 */         criteria.andLike("name", "%" + searchMap.get("name") + "%"); 
/* 132 */       if (searchMap.get("image") != null && !"".equals(searchMap.get("image")))
/* 133 */         criteria.andLike("image", "%" + searchMap.get("image") + "%"); 
/* 136 */       if (searchMap.get("images") != null && !"".equals(searchMap.get("images")))
/* 137 */         criteria.andLike("images", "%" + searchMap.get("images") + "%"); 
/* 140 */       if (searchMap.get("spuId") != null && !"".equals(searchMap.get("spuId")))
/* 141 */         criteria.andEqualTo("spuId", searchMap.get("spuId")); 
/* 144 */       if (searchMap.get("categoryName") != null && !"".equals(searchMap.get("categoryName")))
/* 145 */         criteria.andLike("categoryName", "%" + searchMap.get("categoryName") + "%"); 
/* 148 */       if (searchMap.get("brandName") != null && !"".equals(searchMap.get("brandName")))
/* 149 */         criteria.andLike("brandName", "%" + searchMap.get("brandName") + "%"); 
/* 152 */       if (searchMap.get("spec") != null && !"".equals(searchMap.get("spec")))
/* 153 */         criteria.andLike("spec", "%" + searchMap.get("spec") + "%"); 
/* 156 */       if (searchMap.get("status") != null && !"".equals(searchMap.get("status")))
/* 157 */         criteria.andEqualTo("status", searchMap.get("status")); 
/* 161 */       if (searchMap.get("price") != null)
/* 162 */         criteria.andEqualTo("price", searchMap.get("price")); 
/* 165 */       if (searchMap.get("num") != null)
/* 166 */         criteria.andEqualTo("num", searchMap.get("num")); 
/* 169 */       if (searchMap.get("alertNum") != null)
/* 170 */         criteria.andEqualTo("alertNum", searchMap.get("alertNum")); 
/* 173 */       if (searchMap.get("weight") != null)
/* 174 */         criteria.andEqualTo("weight", searchMap.get("weight")); 
/* 177 */       if (searchMap.get("categoryId") != null)
/* 178 */         criteria.andEqualTo("categoryId", searchMap.get("categoryId")); 
/* 181 */       if (searchMap.get("saleNum") != null)
/* 182 */         criteria.andEqualTo("saleNum", searchMap.get("saleNum")); 
/* 185 */       if (searchMap.get("commentNum") != null)
/* 186 */         criteria.andEqualTo("commentNum", searchMap.get("commentNum")); 
/*     */     } 
/* 190 */     return example;
/*     */   }
/*     */ }


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/service/impl/SkuServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */