/*     */ package com.hero.common.pojo;


/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Table(name = "tb_user")
/*     */ public class User implements Serializable {
/*     */   @Id
/*     */   private String username;
/*     */   
/*     */   private String password;
/*     */   
/*     */   private String phone;
/*     */   
/*     */   private String email;
/*     */   
/*     */   private Date created;
/*     */   
/*     */   private Date updated;
/*     */   
/*     */   private String sourceType;
/*     */   
/*     */   private String nickName;
/*     */   
/*     */   private String name;
/*     */   
/*     */   private String status;
/*     */   
/*     */   private String headPic;
/*     */   
/*     */   private String qq;
/*     */   
/*     */   private String isMobileCheck;
/*     */   
/*     */   private String isEmailCheck;
/*     */   
/*     */   private String sex;
/*     */   
/*     */   private Integer userLevel;
/*     */   
/*     */   private Integer points;
/*     */   
/*     */   private Integer experienceValue;
/*     */   
/*     */   private Date birthday;
/*     */   
/*     */   private Date lastLoginTime;
/*     */   
/*     */   public String getUsername() {
/*  42 */     return this.username;
/*     */   }
/*     */   
/*     */   public void setUsername(String username) {
/*  45 */     this.username = username;
/*     */   }
/*     */   
/*     */   public String getPassword() {
/*  49 */     return this.password;
/*     */   }
/*     */   
/*     */   public void setPassword(String password) {
/*  52 */     this.password = password;
/*     */   }
/*     */   
/*     */   public String getPhone() {
/*  56 */     return this.phone;
/*     */   }
/*     */   
/*     */   public void setPhone(String phone) {
/*  59 */     this.phone = phone;
/*     */   }
/*     */   
/*     */   public String getEmail() {
/*  63 */     return this.email;
/*     */   }
/*     */   
/*     */   public void setEmail(String email) {
/*  66 */     this.email = email;
/*     */   }
/*     */   
/*     */   public Date getCreated() {
/*  70 */     return this.created;
/*     */   }
/*     */   
/*     */   public void setCreated(Date created) {
/*  73 */     this.created = created;
/*     */   }
/*     */   
/*     */   public Date getUpdated() {
/*  77 */     return this.updated;
/*     */   }
/*     */   
/*     */   public void setUpdated(Date updated) {
/*  80 */     this.updated = updated;
/*     */   }
/*     */   
/*     */   public String getSourceType() {
/*  84 */     return this.sourceType;
/*     */   }
/*     */   
/*     */   public void setSourceType(String sourceType) {
/*  87 */     this.sourceType = sourceType;
/*     */   }
/*     */   
/*     */   public String getNickName() {
/*  91 */     return this.nickName;
/*     */   }
/*     */   
/*     */   public void setNickName(String nickName) {
/*  94 */     this.nickName = nickName;
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
/*     */   public String getStatus() {
/* 105 */     return this.status;
/*     */   }
/*     */   
/*     */   public void setStatus(String status) {
/* 108 */     this.status = status;
/*     */   }
/*     */   
/*     */   public String getHeadPic() {
/* 112 */     return this.headPic;
/*     */   }
/*     */   
/*     */   public void setHeadPic(String headPic) {
/* 115 */     this.headPic = headPic;
/*     */   }
/*     */   
/*     */   public String getQq() {
/* 119 */     return this.qq;
/*     */   }
/*     */   
/*     */   public void setQq(String qq) {
/* 122 */     this.qq = qq;
/*     */   }
/*     */   
/*     */   public String getIsMobileCheck() {
/* 126 */     return this.isMobileCheck;
/*     */   }
/*     */   
/*     */   public void setIsMobileCheck(String isMobileCheck) {
/* 129 */     this.isMobileCheck = isMobileCheck;
/*     */   }
/*     */   
/*     */   public String getIsEmailCheck() {
/* 133 */     return this.isEmailCheck;
/*     */   }
/*     */   
/*     */   public void setIsEmailCheck(String isEmailCheck) {
/* 136 */     this.isEmailCheck = isEmailCheck;
/*     */   }
/*     */   
/*     */   public String getSex() {
/* 140 */     return this.sex;
/*     */   }
/*     */   
/*     */   public void setSex(String sex) {
/* 143 */     this.sex = sex;
/*     */   }
/*     */   
/*     */   public Integer getUserLevel() {
/* 147 */     return this.userLevel;
/*     */   }
/*     */   
/*     */   public void setUserLevel(Integer userLevel) {
/* 150 */     this.userLevel = userLevel;
/*     */   }
/*     */   
/*     */   public Integer getPoints() {
/* 154 */     return this.points;
/*     */   }
/*     */   
/*     */   public void setPoints(Integer points) {
/* 157 */     this.points = points;
/*     */   }
/*     */   
/*     */   public Integer getExperienceValue() {
/* 161 */     return this.experienceValue;
/*     */   }
/*     */   
/*     */   public void setExperienceValue(Integer experienceValue) {
/* 164 */     this.experienceValue = experienceValue;
/*     */   }
/*     */   
/*     */   public Date getBirthday() {
/* 168 */     return this.birthday;
/*     */   }
/*     */   
/*     */   public void setBirthday(Date birthday) {
/* 171 */     this.birthday = birthday;
/*     */   }
/*     */   
/*     */   public Date getLastLoginTime() {
/* 175 */     return this.lastLoginTime;
/*     */   }
/*     */   
/*     */   public void setLastLoginTime(Date lastLoginTime) {
/* 178 */     this.lastLoginTime = lastLoginTime;
/*     */   }
/*     */ }


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/User.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */