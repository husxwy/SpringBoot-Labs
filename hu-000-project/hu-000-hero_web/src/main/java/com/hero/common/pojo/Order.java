/*     */ package com.hero.common.pojo;


/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Table(name = "tb_order")
/*     */ public class Order implements Serializable {
/*     */   @Id
/*     */   private String id;
/*     */   
/*     */   private Integer totalNum;
/*     */   
/*     */   private Integer totalMoney;
/*     */   
/*     */   private Integer preMoney;
/*     */   
/*     */   private Integer postFee;
/*     */   
/*     */   private Integer payMoney;
/*     */   
/*     */   private String payType;
/*     */   
/*     */   private Date createTime;
/*     */   
/*     */   private Date updateTime;
/*     */   
/*     */   private Date payTime;
/*     */   
/*     */   private Date consignTime;
/*     */   
/*     */   private Date endTime;
/*     */   
/*     */   private Date closeTime;
/*     */   
/*     */   private String shippingName;
/*     */   
/*     */   private String shippingCode;
/*     */   
/*     */   private String username;
/*     */   
/*     */   private String buyerMessage;
/*     */   
/*     */   private String buyerRate;
/*     */   
/*     */   private String receiverContact;
/*     */   
/*     */   private String receiverMobile;
/*     */   
/*     */   private String receiverAddress;
/*     */   
/*     */   private String sourceType;
/*     */   
/*     */   private String transactionId;
/*     */   
/*     */   private String orderStatus;
/*     */   
/*     */   private String payStatus;
/*     */   
/*     */   private String consignStatus;
/*     */   
/*     */   private String isDelete;
/*     */   
/*     */   public String getId() {
/*  49 */     return this.id;
/*     */   }
/*     */   
/*     */   public void setId(String id) {
/*  52 */     this.id = id;
/*     */   }
/*     */   
/*     */   public Integer getTotalNum() {
/*  56 */     return this.totalNum;
/*     */   }
/*     */   
/*     */   public void setTotalNum(Integer totalNum) {
/*  59 */     this.totalNum = totalNum;
/*     */   }
/*     */   
/*     */   public Integer getTotalMoney() {
/*  63 */     return this.totalMoney;
/*     */   }
/*     */   
/*     */   public void setTotalMoney(Integer totalMoney) {
/*  66 */     this.totalMoney = totalMoney;
/*     */   }
/*     */   
/*     */   public Integer getPreMoney() {
/*  70 */     return this.preMoney;
/*     */   }
/*     */   
/*     */   public void setPreMoney(Integer preMoney) {
/*  73 */     this.preMoney = preMoney;
/*     */   }
/*     */   
/*     */   public Integer getPostFee() {
/*  77 */     return this.postFee;
/*     */   }
/*     */   
/*     */   public void setPostFee(Integer postFee) {
/*  80 */     this.postFee = postFee;
/*     */   }
/*     */   
/*     */   public Integer getPayMoney() {
/*  84 */     return this.payMoney;
/*     */   }
/*     */   
/*     */   public void setPayMoney(Integer payMoney) {
/*  87 */     this.payMoney = payMoney;
/*     */   }
/*     */   
/*     */   public String getPayType() {
/*  91 */     return this.payType;
/*     */   }
/*     */   
/*     */   public void setPayType(String payType) {
/*  94 */     this.payType = payType;
/*     */   }
/*     */   
/*     */   public Date getCreateTime() {
/*  98 */     return this.createTime;
/*     */   }
/*     */   
/*     */   public void setCreateTime(Date createTime) {
/* 101 */     this.createTime = createTime;
/*     */   }
/*     */   
/*     */   public Date getUpdateTime() {
/* 105 */     return this.updateTime;
/*     */   }
/*     */   
/*     */   public void setUpdateTime(Date updateTime) {
/* 108 */     this.updateTime = updateTime;
/*     */   }
/*     */   
/*     */   public Date getPayTime() {
/* 112 */     return this.payTime;
/*     */   }
/*     */   
/*     */   public void setPayTime(Date payTime) {
/* 115 */     this.payTime = payTime;
/*     */   }
/*     */   
/*     */   public Date getConsignTime() {
/* 119 */     return this.consignTime;
/*     */   }
/*     */   
/*     */   public void setConsignTime(Date consignTime) {
/* 122 */     this.consignTime = consignTime;
/*     */   }
/*     */   
/*     */   public Date getEndTime() {
/* 126 */     return this.endTime;
/*     */   }
/*     */   
/*     */   public void setEndTime(Date endTime) {
/* 129 */     this.endTime = endTime;
/*     */   }
/*     */   
/*     */   public Date getCloseTime() {
/* 133 */     return this.closeTime;
/*     */   }
/*     */   
/*     */   public void setCloseTime(Date closeTime) {
/* 136 */     this.closeTime = closeTime;
/*     */   }
/*     */   
/*     */   public String getShippingName() {
/* 140 */     return this.shippingName;
/*     */   }
/*     */   
/*     */   public void setShippingName(String shippingName) {
/* 143 */     this.shippingName = shippingName;
/*     */   }
/*     */   
/*     */   public String getShippingCode() {
/* 147 */     return this.shippingCode;
/*     */   }
/*     */   
/*     */   public void setShippingCode(String shippingCode) {
/* 150 */     this.shippingCode = shippingCode;
/*     */   }
/*     */   
/*     */   public String getUsername() {
/* 154 */     return this.username;
/*     */   }
/*     */   
/*     */   public void setUsername(String username) {
/* 157 */     this.username = username;
/*     */   }
/*     */   
/*     */   public String getBuyerMessage() {
/* 161 */     return this.buyerMessage;
/*     */   }
/*     */   
/*     */   public void setBuyerMessage(String buyerMessage) {
/* 164 */     this.buyerMessage = buyerMessage;
/*     */   }
/*     */   
/*     */   public String getBuyerRate() {
/* 168 */     return this.buyerRate;
/*     */   }
/*     */   
/*     */   public void setBuyerRate(String buyerRate) {
/* 171 */     this.buyerRate = buyerRate;
/*     */   }
/*     */   
/*     */   public String getReceiverContact() {
/* 175 */     return this.receiverContact;
/*     */   }
/*     */   
/*     */   public void setReceiverContact(String receiverContact) {
/* 178 */     this.receiverContact = receiverContact;
/*     */   }
/*     */   
/*     */   public String getReceiverMobile() {
/* 182 */     return this.receiverMobile;
/*     */   }
/*     */   
/*     */   public void setReceiverMobile(String receiverMobile) {
/* 185 */     this.receiverMobile = receiverMobile;
/*     */   }
/*     */   
/*     */   public String getReceiverAddress() {
/* 189 */     return this.receiverAddress;
/*     */   }
/*     */   
/*     */   public void setReceiverAddress(String receiverAddress) {
/* 192 */     this.receiverAddress = receiverAddress;
/*     */   }
/*     */   
/*     */   public String getSourceType() {
/* 196 */     return this.sourceType;
/*     */   }
/*     */   
/*     */   public void setSourceType(String sourceType) {
/* 199 */     this.sourceType = sourceType;
/*     */   }
/*     */   
/*     */   public String getTransactionId() {
/* 203 */     return this.transactionId;
/*     */   }
/*     */   
/*     */   public void setTransactionId(String transactionId) {
/* 206 */     this.transactionId = transactionId;
/*     */   }
/*     */   
/*     */   public String getOrderStatus() {
/* 210 */     return this.orderStatus;
/*     */   }
/*     */   
/*     */   public void setOrderStatus(String orderStatus) {
/* 213 */     this.orderStatus = orderStatus;
/*     */   }
/*     */   
/*     */   public String getPayStatus() {
/* 217 */     return this.payStatus;
/*     */   }
/*     */   
/*     */   public void setPayStatus(String payStatus) {
/* 220 */     this.payStatus = payStatus;
/*     */   }
/*     */   
/*     */   public String getConsignStatus() {
/* 224 */     return this.consignStatus;
/*     */   }
/*     */   
/*     */   public void setConsignStatus(String consignStatus) {
/* 227 */     this.consignStatus = consignStatus;
/*     */   }
/*     */   
/*     */   public String getIsDelete() {
/* 231 */     return this.isDelete;
/*     */   }
/*     */   
/*     */   public void setIsDelete(String isDelete) {
/* 234 */     this.isDelete = isDelete;
/*     */   }
/*     */ }


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/Order.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */