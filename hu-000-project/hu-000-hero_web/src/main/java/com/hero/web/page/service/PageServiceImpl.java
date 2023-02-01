/*     */ package com.hero.web.page.service;
/*     */ 
/*     */ import com.alibaba.fastjson.JSON;
/*     */ import com.hero.common.pojo.Category;
/*     */ import com.hero.common.pojo.Sku;
/*     */ import com.hero.common.pojo.Spu;
/*     */ import com.hero.web.goods.service.CategoryService;
/*     */ import com.hero.web.goods.service.SkuService;
/*     */ import com.hero.web.goods.service.SpuService;
/*     */ import com.hero.web.page.service.PageService;
/*     */ import java.io.PrintWriter;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Service;
/*     */ import org.springframework.util.StringUtils;
/*     */ import org.thymeleaf.TemplateEngine;
/*     */ import org.thymeleaf.context.Context;
/*     */ import org.thymeleaf.context.IContext;
/*     */ 
/*     */ @Service
/*     */ public class PageServiceImpl implements PageService {
/*     */   @Autowired
/*     */   private SpuService spuService;
/*     */   
/*     */   @Autowired
/*     */   private SkuService skuService;
/*     */   
/*     */   @Autowired
/*     */   private CategoryService categoryService;
/*     */   
/*     */   @Autowired
/*     */   private TemplateEngine templateEngine;
/*     */   
/*     */   private String path;
/*     */   
/*     */   public Map<String, Object> findPageAllDataBySpuId(String spuId) {
/*  47 */     Map<String, Object> resultMap = new HashMap<>();
/*  50 */     Spu spu = this.spuService.findById(spuId);
/*  53 */     List<Sku> skuList = this.skuService.findBySpuId(spuId);
/*  55 */     if (spu == null)
/*  56 */       throw new RuntimeException("商品id没有对应的商品数据, 无法生成详情页, spuid====" + spuId); 
/*  58 */     if (skuList == null || skuList.size() == 0)
/*  59 */       throw new RuntimeException("商品id没有对应的sku库存数据, 无法生成详情页, spuid====" + spuId); 
/*  63 */     Category category1 = this.categoryService.findOneById(spu.getCategory1Id());
/*  64 */     Category category2 = this.categoryService.findOneById(spu.getCategory2Id());
/*  65 */     Category category3 = this.categoryService.findOneById(spu.getCategory3Id());
/*  68 */     String imageJsonStr = spu.getImages();
/*  69 */     String imageList = "";
/*  70 */     if (!StringUtils.isEmpty(imageJsonStr)) {
/*  72 */       List<Map> imagesList = JSON.parseArray(imageJsonStr, Map.class);
/*  73 */       if (imagesList != null && imagesList.size() > 0)
/*  74 */         imageList = String.valueOf(((Map)imagesList.get(0)).get("url")); 
/*     */     } 
/*  80 */     String specItemsJsonStr = spu.getSpecItems();
/*  81 */     Map specificationList = (Map)JSON.parseObject(specItemsJsonStr, Map.class);
/*  84 */     resultMap.put("spu", spu);
/*  85 */     resultMap.put("skuList", skuList);
/*  86 */     resultMap.put("category1", category1);
/*  87 */     resultMap.put("category2", category2);
/*  88 */     resultMap.put("category3", category3);
/*  89 */     resultMap.put("specificationList", specificationList);
/*  90 */     resultMap.put("imageList", imageList);
/*  92 */     return resultMap;
/*     */   }
/*     */   
/*     */   public void createStaticPage(Map<String, Object> dataMap, String spuId) throws Exception {
/*  98 */     Context context = new Context();
/*  99 */     context.setVariables(dataMap);
/* 102 */     this.path += "/" + spuId + ".html";
/* 103 */     PrintWriter printWriter = new PrintWriter(this.path);
/* 107 */     this.templateEngine.process("item", (IContext)context, printWriter);
/*     */   }
/*     */ }


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/page/service/PageServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */