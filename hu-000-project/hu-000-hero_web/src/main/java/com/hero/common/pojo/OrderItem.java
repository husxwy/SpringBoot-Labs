/*     */ package com.hero.common.pojo;


/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Table(name = "tb_order_item")
/*     */ public class OrderItem implements Serializable {
/*     */   @Id
/*     */   private String id;
/*     */   
/*     */   private Integer categoryId1;
/*     */   
/*     */   private Integer categoryId2;
/*     */   
/*     */   private Integer categoryId3;
/*     */   
/*     */   private String spuId;
/*     */   
/*     */   private String skuId;
/*     */   
/*     */   private String orderId;
/*     */   
/*     */   private String name;
/*     */   
/*     */   private Integer price;
/*     */   
/*     */   private Integer num;
/*     */   
/*     */   private Integer money;
/*     */   
/*     */   private Integer payMoney;
/*     */   
/*     */   private String image;
/*     */   
/*     */   private Integer weight;
/*     */   
/*     */   private Integer postFee;
/*     */   
/*     */   private String isReturn;
/*     */   
/*     */   private boolean checked;
/*     */   
/*     */   public boolean isChecked() {
/*  40 */     return this.checked;
/*     */   }
/*     */   
/*     */   public void setChecked(boolean checked) {
/*  44 */     this.checked = checked;
/*     */   }
/*     */   
/*     */   public String getId() {
/*  49 */     return this.id;
/*     */   }
/*     */   
/*     */   public void setId(String id) {
/*  52 */     this.id = id;
/*     */   }
/*     */   
/*     */   public Integer getCategoryId1() {
/*  56 */     return this.categoryId1;
/*     */   }
/*     */   
/*     */   public void setCategoryId1(Integer categoryId1) {
/*  59 */     this.categoryId1 = categoryId1;
/*     */   }
/*     */   
/*     */   public Integer getCategoryId2() {
/*  63 */     return this.categoryId2;
/*     */   }
/*     */   
/*     */   public void setCategoryId2(Integer categoryId2) {
/*  66 */     this.categoryId2 = categoryId2;
/*     */   }
/*     */   
/*     */   public Integer getCategoryId3() {
/*  70 */     return this.categoryId3;
/*     */   }
/*     */   
/*     */   public void setCategoryId3(Integer categoryId3) {
/*  73 */     this.categoryId3 = categoryId3;
/*     */   }
/*     */   
/*     */   public String getSpuId() {
/*  77 */     return this.spuId;
/*     */   }
/*     */   
/*     */   public void setSpuId(String spuId) {
/*  80 */     this.spuId = spuId;
/*     */   }
/*     */   
/*     */   public String getSkuId() {
/*  84 */     return this.skuId;
/*     */   }
/*     */   
/*     */   public void setSkuId(String skuId) {
/*  87 */     this.skuId = skuId;
/*     */   }
/*     */   
/*     */   public String getOrderId() {
/*  91 */     return this.orderId;
/*     */   }
/*     */   
/*     */   public void setOrderId(String orderId) {
/*  94 */     this.orderId = orderId;
/*     */   }
/*     */   
/*     */   public String getName() {
/*  98 */     return this.name;
/*     */   }
/*     */   
/*     */   public void setName(String name) {
/* 101 */     this.name = name;
/*     */   }
/*     */   
/*     */   public Integer getPrice() {
/* 105 */     return this.price;
/*     */   }
/*     */   
/*     */   public void setPrice(Integer price) {
/* 108 */     this.price = price;
/*     */   }
/*     */   
/*     */   public Integer getNum() {
/* 112 */     return this.num;
/*     */   }
/*     */   
/*     */   public void setNum(Integer num) {
/* 115 */     this.num = num;
/*     */   }
/*     */   
/*     */   public Integer getMoney() {
/* 119 */     return this.money;
/*     */   }
/*     */   
/*     */   public void setMoney(Integer money) {
/* 122 */     this.money = money;
/*     */   }
/*     */   
/*     */   public Integer getPayMoney() {
/* 126 */     return this.payMoney;
/*     */   }
/*     */   
/*     */   public void setPayMoney(Integer payMoney) {
/* 129 */     this.payMoney = payMoney;
/*     */   }
/*     */   
/*     */   public String getImage() {
/* 133 */     return this.image;
/*     */   }
/*     */   
/*     */   public void setImage(String image) {
/* 136 */     this.image = image;
/*     */   }
/*     */   
/*     */   public Integer getWeight() {
/* 140 */     return this.weight;
/*     */   }
/*     */   
/*     */   public void setWeight(Integer weight) {
/* 143 */     this.weight = weight;
/*     */   }
/*     */   
/*     */   public Integer getPostFee() {
/* 147 */     return this.postFee;
/*     */   }
/*     */   
/*     */   public void setPostFee(Integer postFee) {
/* 150 */     this.postFee = postFee;
/*     */   }
/*     */   
/*     */   public String getIsReturn() {
/* 154 */     return this.isReturn;
/*     */   }
/*     */   
/*     */   public void setIsReturn(String isReturn) {
/* 157 */     this.isReturn = isReturn;
/*     */   }
/*     */ }


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/OrderItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */