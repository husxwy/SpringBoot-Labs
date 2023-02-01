/*     */ package com.hero.common.pojo;


/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Table(name = "tb_sku")
/*     */ public class Sku implements Serializable {
/*     */   @Id
/*     */   private String id;
/*     */   
/*     */   private String sn;
/*     */   
/*     */   private String name;
/*     */   
/*     */   private Integer price;
/*     */   
/*     */   private Integer num;
/*     */   
/*     */   private Integer alertNum;
/*     */   
/*     */   private String image;
/*     */   
/*     */   private String images;
/*     */   
/*     */   private Integer weight;
/*     */   
/*     */   private Date createTime;
/*     */   
/*     */   private Date updateTime;
/*     */   
/*     */   private String spuId;
/*     */   
/*     */   private Integer categoryId;
/*     */   
/*     */   private String categoryName;
/*     */   
/*     */   private String brandName;
/*     */   
/*     */   private String spec;
/*     */   
/*     */   private Integer saleNum;
/*     */   
/*     */   private Integer commentNum;
/*     */   
/*     */   private String status;
/*     */   
/*     */   public String getId() {
/*  41 */     return this.id;
/*     */   }
/*     */   
/*     */   public void setId(String id) {
/*  44 */     this.id = id;
/*     */   }
/*     */   
/*     */   public String getSn() {
/*  48 */     return this.sn;
/*     */   }
/*     */   
/*     */   public void setSn(String sn) {
/*  51 */     this.sn = sn;
/*     */   }
/*     */   
/*     */   public String getName() {
/*  55 */     return this.name;
/*     */   }
/*     */   
/*     */   public void setName(String name) {
/*  58 */     this.name = name;
/*     */   }
/*     */   
/*     */   public Integer getPrice() {
/*  62 */     return this.price;
/*     */   }
/*     */   
/*     */   public void setPrice(Integer price) {
/*  65 */     this.price = price;
/*     */   }
/*     */   
/*     */   public Integer getNum() {
/*  69 */     return this.num;
/*     */   }
/*     */   
/*     */   public void setNum(Integer num) {
/*  72 */     this.num = num;
/*     */   }
/*     */   
/*     */   public Integer getAlertNum() {
/*  76 */     return this.alertNum;
/*     */   }
/*     */   
/*     */   public void setAlertNum(Integer alertNum) {
/*  79 */     this.alertNum = alertNum;
/*     */   }
/*     */   
/*     */   public String getImage() {
/*  83 */     return this.image;
/*     */   }
/*     */   
/*     */   public void setImage(String image) {
/*  86 */     this.image = image;
/*     */   }
/*     */   
/*     */   public String getImages() {
/*  90 */     return this.images;
/*     */   }
/*     */   
/*     */   public void setImages(String images) {
/*  93 */     this.images = images;
/*     */   }
/*     */   
/*     */   public Integer getWeight() {
/*  97 */     return this.weight;
/*     */   }
/*     */   
/*     */   public void setWeight(Integer weight) {
/* 100 */     this.weight = weight;
/*     */   }
/*     */   
/*     */   public Date getCreateTime() {
/* 104 */     return this.createTime;
/*     */   }
/*     */   
/*     */   public void setCreateTime(Date createTime) {
/* 107 */     this.createTime = createTime;
/*     */   }
/*     */   
/*     */   public Date getUpdateTime() {
/* 111 */     return this.updateTime;
/*     */   }
/*     */   
/*     */   public void setUpdateTime(Date updateTime) {
/* 114 */     this.updateTime = updateTime;
/*     */   }
/*     */   
/*     */   public String getSpuId() {
/* 118 */     return this.spuId;
/*     */   }
/*     */   
/*     */   public void setSpuId(String spuId) {
/* 121 */     this.spuId = spuId;
/*     */   }
/*     */   
/*     */   public Integer getCategoryId() {
/* 125 */     return this.categoryId;
/*     */   }
/*     */   
/*     */   public void setCategoryId(Integer categoryId) {
/* 128 */     this.categoryId = categoryId;
/*     */   }
/*     */   
/*     */   public String getCategoryName() {
/* 132 */     return this.categoryName;
/*     */   }
/*     */   
/*     */   public void setCategoryName(String categoryName) {
/* 135 */     this.categoryName = categoryName;
/*     */   }
/*     */   
/*     */   public String getBrandName() {
/* 139 */     return this.brandName;
/*     */   }
/*     */   
/*     */   public void setBrandName(String brandName) {
/* 142 */     this.brandName = brandName;
/*     */   }
/*     */   
/*     */   public String getSpec() {
/* 146 */     return this.spec;
/*     */   }
/*     */   
/*     */   public void setSpec(String spec) {
/* 149 */     this.spec = spec;
/*     */   }
/*     */   
/*     */   public Integer getSaleNum() {
/* 153 */     return this.saleNum;
/*     */   }
/*     */   
/*     */   public void setSaleNum(Integer saleNum) {
/* 156 */     this.saleNum = saleNum;
/*     */   }
/*     */   
/*     */   public Integer getCommentNum() {
/* 160 */     return this.commentNum;
/*     */   }
/*     */   
/*     */   public void setCommentNum(Integer commentNum) {
/* 163 */     this.commentNum = commentNum;
/*     */   }
/*     */   
/*     */   public String getStatus() {
/* 167 */     return this.status;
/*     */   }
/*     */   
/*     */   public void setStatus(String status) {
/* 170 */     this.status = status;
/*     */   }
/*     */ }


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/Sku.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */