/*     */ package com.hero.common.pojo;


/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Table(name = "tb_spu")
/*     */ public class Spu implements Serializable {
/*     */   @Id
/*     */   private String id;
/*     */   
/*     */   private String sn;
/*     */   
/*     */   private String name;
/*     */   
/*     */   private String caption;
/*     */   
/*     */   private Integer brandId;
/*     */   
/*     */   private Integer category1Id;
/*     */   
/*     */   private Integer category2Id;
/*     */   
/*     */   private Integer category3Id;
/*     */   
/*     */   private Integer templateId;
/*     */   
/*     */   private Integer freightId;
/*     */   
/*     */   private String image;
/*     */   
/*     */   private String images;
/*     */   
/*     */   private String saleService;
/*     */   
/*     */   private String introduction;
/*     */   
/*     */   private String specItems;
/*     */   
/*     */   private String paraItems;
/*     */   
/*     */   private Integer saleNum;
/*     */   
/*     */   private Integer commentNum;
/*     */   
/*     */   private String isMarketable;
/*     */   
/*     */   private String isEnableSpec;
/*     */   
/*     */   private String isDelete;
/*     */   
/*     */   private String status;
/*     */   
/*     */   public String getId() {
/*  44 */     return this.id;
/*     */   }
/*     */   
/*     */   public void setId(String id) {
/*  47 */     this.id = id;
/*     */   }
/*     */   
/*     */   public String getSn() {
/*  51 */     return this.sn;
/*     */   }
/*     */   
/*     */   public void setSn(String sn) {
/*  54 */     this.sn = sn;
/*     */   }
/*     */   
/*     */   public String getName() {
/*  58 */     return this.name;
/*     */   }
/*     */   
/*     */   public void setName(String name) {
/*  61 */     this.name = name;
/*     */   }
/*     */   
/*     */   public String getCaption() {
/*  65 */     return this.caption;
/*     */   }
/*     */   
/*     */   public void setCaption(String caption) {
/*  68 */     this.caption = caption;
/*     */   }
/*     */   
/*     */   public Integer getBrandId() {
/*  72 */     return this.brandId;
/*     */   }
/*     */   
/*     */   public void setBrandId(Integer brandId) {
/*  75 */     this.brandId = brandId;
/*     */   }
/*     */   
/*     */   public Integer getCategory1Id() {
/*  79 */     return this.category1Id;
/*     */   }
/*     */   
/*     */   public void setCategory1Id(Integer category1Id) {
/*  82 */     this.category1Id = category1Id;
/*     */   }
/*     */   
/*     */   public Integer getCategory2Id() {
/*  86 */     return this.category2Id;
/*     */   }
/*     */   
/*     */   public void setCategory2Id(Integer category2Id) {
/*  89 */     this.category2Id = category2Id;
/*     */   }
/*     */   
/*     */   public Integer getCategory3Id() {
/*  93 */     return this.category3Id;
/*     */   }
/*     */   
/*     */   public void setCategory3Id(Integer category3Id) {
/*  96 */     this.category3Id = category3Id;
/*     */   }
/*     */   
/*     */   public Integer getTemplateId() {
/* 100 */     return this.templateId;
/*     */   }
/*     */   
/*     */   public void setTemplateId(Integer templateId) {
/* 103 */     this.templateId = templateId;
/*     */   }
/*     */   
/*     */   public Integer getFreightId() {
/* 107 */     return this.freightId;
/*     */   }
/*     */   
/*     */   public void setFreightId(Integer freightId) {
/* 110 */     this.freightId = freightId;
/*     */   }
/*     */   
/*     */   public String getImage() {
/* 114 */     return this.image;
/*     */   }
/*     */   
/*     */   public void setImage(String image) {
/* 117 */     this.image = image;
/*     */   }
/*     */   
/*     */   public String getImages() {
/* 121 */     return this.images;
/*     */   }
/*     */   
/*     */   public void setImages(String images) {
/* 124 */     this.images = images;
/*     */   }
/*     */   
/*     */   public String getSaleService() {
/* 128 */     return this.saleService;
/*     */   }
/*     */   
/*     */   public void setSaleService(String saleService) {
/* 131 */     this.saleService = saleService;
/*     */   }
/*     */   
/*     */   public String getIntroduction() {
/* 135 */     return this.introduction;
/*     */   }
/*     */   
/*     */   public void setIntroduction(String introduction) {
/* 138 */     this.introduction = introduction;
/*     */   }
/*     */   
/*     */   public String getSpecItems() {
/* 142 */     return this.specItems;
/*     */   }
/*     */   
/*     */   public void setSpecItems(String specItems) {
/* 145 */     this.specItems = specItems;
/*     */   }
/*     */   
/*     */   public String getParaItems() {
/* 149 */     return this.paraItems;
/*     */   }
/*     */   
/*     */   public void setParaItems(String paraItems) {
/* 152 */     this.paraItems = paraItems;
/*     */   }
/*     */   
/*     */   public Integer getSaleNum() {
/* 156 */     return this.saleNum;
/*     */   }
/*     */   
/*     */   public void setSaleNum(Integer saleNum) {
/* 159 */     this.saleNum = saleNum;
/*     */   }
/*     */   
/*     */   public Integer getCommentNum() {
/* 163 */     return this.commentNum;
/*     */   }
/*     */   
/*     */   public void setCommentNum(Integer commentNum) {
/* 166 */     this.commentNum = commentNum;
/*     */   }
/*     */   
/*     */   public String getIsMarketable() {
/* 170 */     return this.isMarketable;
/*     */   }
/*     */   
/*     */   public void setIsMarketable(String isMarketable) {
/* 173 */     this.isMarketable = isMarketable;
/*     */   }
/*     */   
/*     */   public String getIsEnableSpec() {
/* 177 */     return this.isEnableSpec;
/*     */   }
/*     */   
/*     */   public void setIsEnableSpec(String isEnableSpec) {
/* 180 */     this.isEnableSpec = isEnableSpec;
/*     */   }
/*     */   
/*     */   public String getIsDelete() {
/* 184 */     return this.isDelete;
/*     */   }
/*     */   
/*     */   public void setIsDelete(String isDelete) {
/* 187 */     this.isDelete = isDelete;
/*     */   }
/*     */   
/*     */   public String getStatus() {
/* 191 */     return this.status;
/*     */   }
/*     */   
/*     */   public void setStatus(String status) {
/* 194 */     this.status = status;
/*     */   }
/*     */ }


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/Spu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */