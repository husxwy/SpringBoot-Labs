/*     */ package com.hero.web.goods.service.impl;
/*     */ 
/*     */ import com.alibaba.fastjson.JSON;
/*     */ import com.github.pagehelper.PageHelper;
/*     */ import com.hero.common.entity.Page;
/*     */ import com.hero.common.pojo.Brand;
/*     */ import com.hero.common.pojo.Category;
/*     */ import com.hero.common.pojo.CategoryBrand;
/*     */ import com.hero.common.pojo.Goods;
/*     */ import com.hero.common.pojo.Sku;
/*     */ import com.hero.common.pojo.Spu;
/*     */ import com.hero.common.util.IdWorker;
/*     */ import com.hero.web.goods.dao.BrandMapper;
/*     */ import com.hero.web.goods.dao.CategoryBrandMpper;
/*     */ import com.hero.web.goods.dao.CategoryMapper;
/*     */ import com.hero.web.goods.dao.SkuMapper;
/*     */ import com.hero.web.goods.dao.SpuMapper;
/*     */ import com.hero.web.goods.service.SpuService;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Service;
/*     */ import org.springframework.transaction.annotation.Transactional;
/*     */ import org.springframework.util.StringUtils;
/*     */ import tk.mybatis.mapper.entity.Example;
/*     */ 
/*     */ @Service
/*     */ public class SpuServiceImpl implements SpuService {
/*  27 */   private static final Logger log = LoggerFactory.getLogger(com.hero.web.goods.service.impl.SpuServiceImpl.class);
/*     */   
/*     */   @Autowired
/*     */   private SpuMapper spuMapper;
/*     */   
/*     */   @Autowired
/*     */   private SkuMapper skuMapper;
/*     */   
/*     */   @Autowired
/*     */   private IdWorker idWorker;
/*     */   
/*     */   @Autowired
/*     */   private BrandMapper brandMapper;
/*     */   
/*     */   @Autowired
/*     */   private CategoryMapper categoryMapper;
/*     */   
/*     */   @Autowired
/*     */   private CategoryBrandMpper categoryBrandMpper;
/*     */   
/*     */   public List<Spu> findAll() {
/*  54 */     return this.spuMapper.selectAll();
/*     */   }
/*     */   
/*     */   public Spu findById(String id) {
/*  66 */     Spu spu = (Spu)this.spuMapper.selectByPrimaryKey(id);
/*  76 */     return spu;
/*     */   }
/*     */   
/*     */   public void add(Spu spu) {
/*  86 */     this.spuMapper.insert(spu);
/*     */   }
/*     */   
/*     */   public void update(Spu spu) {
/*  96 */     this.spuMapper.updateByPrimaryKey(spu);
/*     */   }
/*     */   
/*     */   public void delete(String id) {
/* 105 */     this.spuMapper.deleteByPrimaryKey(id);
/*     */   }
/*     */   
/*     */   public List<Spu> findList(Map<String, Object> searchMap) {
/* 116 */     Example example = createExample(searchMap);
/* 117 */     return this.spuMapper.selectByExample(example);
/*     */   }
/*     */   
/*     */   public Page<Spu> findPage(int page, int size) {
/* 128 */     PageHelper.startPage(page, size);
/* 129 */     return (Page<Spu>)this.spuMapper.selectAll();
/*     */   }
/*     */   
/*     */   public Page<Spu> findPage(Map<String, Object> searchMap, int page, int size) {
/* 141 */     PageHelper.startPage(page, size);
/* 142 */     Example example = createExample(searchMap);
/* 143 */     return (Page<Spu>)this.spuMapper.selectByExample(example);
/*     */   }
/*     */   
/*     */   private Example createExample(Map<String, Object> searchMap) {
/* 152 */     Example example = new Example(Spu.class);
/* 153 */     Example.Criteria criteria = example.createCriteria();
/* 154 */     if (searchMap != null) {
/* 156 */       if (searchMap.get("id") != null && !"".equals(searchMap.get("id")))
/* 157 */         criteria.andEqualTo("id", searchMap.get("id")); 
/* 160 */       if (searchMap.get("sn") != null && !"".equals(searchMap.get("sn")))
/* 161 */         criteria.andEqualTo("sn", searchMap.get("sn")); 
/* 164 */       if (searchMap.get("name") != null && !"".equals(searchMap.get("name")))
/* 165 */         criteria.andLike("name", "%" + searchMap.get("name") + "%"); 
/* 168 */       if (searchMap.get("caption") != null && !"".equals(searchMap.get("caption")))
/* 169 */         criteria.andLike("caption", "%" + searchMap.get("caption") + "%"); 
/* 172 */       if (searchMap.get("image") != null && !"".equals(searchMap.get("image")))
/* 173 */         criteria.andLike("image", "%" + searchMap.get("image") + "%"); 
/* 176 */       if (searchMap.get("images") != null && !"".equals(searchMap.get("images")))
/* 177 */         criteria.andLike("images", "%" + searchMap.get("images") + "%"); 
/* 180 */       if (searchMap.get("saleService") != null && !"".equals(searchMap.get("saleService")))
/* 181 */         criteria.andLike("saleService", "%" + searchMap.get("saleService") + "%"); 
/* 184 */       if (searchMap.get("introduction") != null && !"".equals(searchMap.get("introduction")))
/* 185 */         criteria.andLike("introduction", "%" + searchMap.get("introduction") + "%"); 
/* 188 */       if (searchMap.get("specItems") != null && !"".equals(searchMap.get("specItems")))
/* 189 */         criteria.andLike("specItems", "%" + searchMap.get("specItems") + "%"); 
/* 192 */       if (searchMap.get("paraItems") != null && !"".equals(searchMap.get("paraItems")))
/* 193 */         criteria.andLike("paraItems", "%" + searchMap.get("paraItems") + "%"); 
/* 196 */       if (searchMap.get("isMarketable") != null && !"".equals(searchMap.get("isMarketable")))
/* 197 */         criteria.andEqualTo("isMarketable", searchMap.get("isMarketable")); 
/* 200 */       if (searchMap.get("isEnableSpec") != null && !"".equals(searchMap.get("isEnableSpec")))
/* 201 */         criteria.andEqualTo("isEnableSpec", searchMap.get("isEnableSpec")); 
/* 204 */       if (searchMap.get("isDelete") != null && !"".equals(searchMap.get("isDelete")))
/* 205 */         criteria.andEqualTo("isDelete", searchMap.get("isDelete")); 
/* 208 */       if (searchMap.get("status") != null && !"".equals(searchMap.get("status")))
/* 209 */         criteria.andEqualTo("status", searchMap.get("status")); 
/* 213 */       if (searchMap.get("brandId") != null)
/* 214 */         criteria.andEqualTo("brandId", searchMap.get("brandId")); 
/* 217 */       if (searchMap.get("category1Id") != null)
/* 218 */         criteria.andEqualTo("category1Id", searchMap.get("category1Id")); 
/* 221 */       if (searchMap.get("category2Id") != null)
/* 222 */         criteria.andEqualTo("category2Id", searchMap.get("category2Id")); 
/* 225 */       if (searchMap.get("category3Id") != null)
/* 226 */         criteria.andEqualTo("category3Id", searchMap.get("category3Id")); 
/* 229 */       if (searchMap.get("templateId") != null)
/* 230 */         criteria.andEqualTo("templateId", searchMap.get("templateId")); 
/* 233 */       if (searchMap.get("freightId") != null)
/* 234 */         criteria.andEqualTo("freightId", searchMap.get("freightId")); 
/* 237 */       if (searchMap.get("saleNum") != null)
/* 238 */         criteria.andEqualTo("saleNum", searchMap.get("saleNum")); 
/* 241 */       if (searchMap.get("commentNum") != null)
/* 242 */         criteria.andEqualTo("commentNum", searchMap.get("commentNum")); 
/*     */     } 
/* 246 */     return example;
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void addGoods(Goods goods) {
/* 254 */     goods.getSpu().setId(String.valueOf(this.idWorker.nextId()));
/* 255 */     this.spuMapper.insertSelective(goods.getSpu());
/* 257 */     saveSkuList(goods);
/*     */   }
/*     */   
/*     */   private void saveSkuList(Goods goods) {
/* 261 */     Spu spu = goods.getSpu();
/* 262 */     Integer brandId = spu.getBrandId();
/* 263 */     Integer category3Id = spu.getCategory3Id();
/* 264 */     if (brandId == null || brandId.intValue() == 0)
/* 265 */       throw new RuntimeException("品牌ID不能为空"); 
/* 267 */     if (category3Id == null || category3Id.intValue() == 0)
/* 268 */       throw new RuntimeException("分类ID不能为空"); 
/* 272 */     Brand brand = (Brand)this.brandMapper.selectByPrimaryKey(brandId);
/* 274 */     Category category = (Category)this.categoryMapper.selectByPrimaryKey(category3Id);
/* 277 */     CategoryBrand cond = new CategoryBrand();
/* 278 */     cond.setCategoryId(category3Id);
/* 279 */     cond.setBrandId(brandId);
/* 280 */     int count = this.categoryBrandMpper.selectCount(cond);
/* 281 */     if (count == 0)
/* 282 */       this.categoryBrandMpper.insertSelective(cond); 
/* 285 */     List<Sku> skuList = goods.getSkuList();
/* 286 */     if (skuList != null && skuList.size() > 0)
/* 287 */       for (Sku sku : skuList) {
/* 288 */         sku.setId(String.valueOf(this.idWorker.nextId()));
/* 289 */         if (StringUtils.isEmpty(sku.getSpec()))
/* 290 */           sku.setSpec("{}"); 
/* 292 */         String skuName = spu.getName();
/* 293 */         Map<String, String> specMap = (Map<String, String>)JSON.parseObject(sku.getSpec(), Map.class);
/* 294 */         for (String key : specMap.keySet()) {
/* 295 */           String val = specMap.get(key);
/* 296 */           skuName = skuName + " " + val;
/*     */         } 
/* 298 */         sku.setName(skuName);
/* 299 */         sku.setCreateTime(new Date());
/* 300 */         sku.setUpdateTime(new Date());
/* 301 */         sku.setSpuId(spu.getId());
/* 302 */         if (category != null) {
/* 303 */           sku.setCategoryId(category3Id);
/* 304 */           sku.setCategoryName(category.getName());
/*     */         } 
/* 306 */         if (brand != null)
/* 307 */           sku.setBrandName(brand.getName()); 
/* 309 */         this.skuMapper.insertSelective(sku);
/*     */       }  
/*     */   }
/*     */   
/*     */   public Goods findBySpuId(String spuId) {
/* 318 */     Spu spu = this.spuMapper.queryBySpuid(spuId);
/* 321 */     List<Sku> skuList = this.skuMapper.querySkusByspuId(spuId);
/* 324 */     Goods goods = new Goods();
/* 325 */     goods.setSpu(spu);
/* 326 */     goods.setSkuList(skuList);
/* 328 */     return goods;
/*     */   }
/*     */   
/*     */   @Transactional
/*     */   public void updateGoods(Goods goods) {
/* 336 */     Spu spu = goods.getSpu();
/* 337 */     this.spuMapper.updateByPrimaryKey(spu);
/* 340 */     Sku sku = new Sku();
/* 341 */     sku.setSpuId(spu.getId());
/* 342 */     this.skuMapper.delete(sku);
/* 345 */     saveSkuList(goods);
/*     */   }
/*     */   
/*     */   public void auditGoods(String spuId) {
/* 352 */     Spu spu = (Spu)this.spuMapper.selectByPrimaryKey(spuId);
/* 355 */     if (spu == null)
/* 356 */       throw new RuntimeException("spu不存在！"); 
/* 360 */     if (!"0".equals(spu.getStatus()))
/* 361 */       throw new RuntimeException("spu状态不对"); 
/* 365 */     Spu spuCon = new Spu();
/* 366 */     spuCon.setId(spuId);
/* 367 */     spuCon.setStatus("1");
/* 368 */     this.spuMapper.updateByPrimaryKeySelective(spuCon);
/*     */   }
/*     */   
/*     */   public void upGoods(String spuId) {
/* 375 */     Spu spu = (Spu)this.spuMapper.selectByPrimaryKey(spuId);
/* 378 */     if (spu == null)
/* 379 */       throw new RuntimeException("spu不存在！"); 
/* 383 */     if (!"1".equals(spu.getStatus()))
/* 384 */       throw new RuntimeException("spu未审核不能上架"); 
/* 388 */     if (!"0".equals(spu.getIsMarketable()))
/* 389 */       throw new RuntimeException("spu已经上架不能再次上架"); 
/* 393 */     if (!"0".equals(spu.getIsDelete()))
/* 394 */       throw new RuntimeException("spu已被删除不能上架"); 
/* 398 */     Spu spuCon = new Spu();
/* 399 */     spuCon.setId(spuId);
/* 400 */     spuCon.setIsMarketable("1");
/* 401 */     this.spuMapper.updateByPrimaryKeySelective(spuCon);
/*     */   }
/*     */   
/*     */   public void downGoods(String spuId) {
/* 411 */     Spu spu = (Spu)this.spuMapper.selectByPrimaryKey(spuId);
/* 414 */     if (spu == null)
/* 415 */       throw new RuntimeException("spu不存在！"); 
/* 419 */     if (!"1".equals(spu.getIsMarketable()))
/* 420 */       throw new RuntimeException("spu已经下架不能再次下架"); 
/* 424 */     Spu spuCon = new Spu();
/* 425 */     spuCon.setId(spuId);
/* 426 */     spuCon.setIsMarketable("0");
/* 427 */     this.spuMapper.updateByPrimaryKeySelective(spuCon);
/*     */   }
/*     */   
/*     */   public void deleteLogic(String spuId) {
/* 437 */     Spu spu = deleteCondition(spuId);
/* 440 */     if (!"0".equals(spu.getIsDelete()))
/* 441 */       throw new RuntimeException("spu已经被删除过无需再次删除"); 
/* 445 */     Spu spuCon = new Spu();
/* 446 */     spuCon.setId(spuId);
/* 447 */     spuCon.setIsDelete("1");
/* 448 */     this.spuMapper.updateByPrimaryKeySelective(spuCon);
/*     */   }
/*     */   
/*     */   private Spu deleteCondition(String spuId) {
/* 452 */     Spu spu = (Spu)this.spuMapper.selectByPrimaryKey(spuId);
/* 455 */     if (spu == null)
/* 456 */       throw new RuntimeException("spu不存在！"); 
/* 460 */     if (!"0".equals(spu.getIsMarketable()))
/* 461 */       throw new RuntimeException("spu必须下架才能删除"); 
/* 463 */     return spu;
/*     */   }
/*     */   
/*     */   public void restore(String spuId) {
/* 469 */     Spu spu = (Spu)this.spuMapper.selectByPrimaryKey(spuId);
/* 472 */     if (spu == null)
/* 473 */       throw new RuntimeException("spu不存在！"); 
/* 477 */     if (!"1".equals(spu.getIsDelete()))
/* 478 */       throw new RuntimeException("spu已经恢复过无需再次恢复"); 
/* 482 */     Spu spuCon = new Spu();
/* 483 */     spuCon.setId(spuId);
/* 484 */     spuCon.setIsDelete("0");
/* 485 */     this.spuMapper.updateByPrimaryKeySelective(spuCon);
/*     */   }
/*     */   
/*     */   public void deleteGoods(String spuId) {
/* 492 */     Spu spu = (Spu)this.spuMapper.selectByPrimaryKey(spuId);
/* 495 */     if (spu == null)
/* 496 */       throw new RuntimeException("spu不存在！"); 
/* 500 */     if (!"0".equals(spu.getIsMarketable()))
/* 501 */       throw new RuntimeException("spu必须下架才能删除"); 
/* 506 */     this.spuMapper.deleteByPrimaryKey(spuId);
/* 509 */     Sku sku = new Sku();
/* 510 */     sku.setSpuId(spuId);
/* 511 */     this.skuMapper.delete(sku);
/*     */   }
/*     */ }


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/service/impl/SpuServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */