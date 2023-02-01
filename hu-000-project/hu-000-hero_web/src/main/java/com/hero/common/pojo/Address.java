package com.hero.common.pojo;



import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_address")
public class Address implements Serializable {
  @Id
  private Integer id;
  
  private String username;
  
  private String provinceid;
  
  private String cityid;
  
  private String areaid;
  
  private String phone;
  
  private String address;
  
  private String contact;
  
  private String isDefault;
  
  private String alias;
  
  public Integer getId() {
/* 32 */     return this.id;
  }
  
  public void setId(Integer id) {
/* 35 */     this.id = id;
  }
  
  public String getUsername() {
/* 39 */     return this.username;
  }
  
  public void setUsername(String username) {
/* 42 */     this.username = username;
  }
  
  public String getProvinceid() {
/* 46 */     return this.provinceid;
  }
  
  public void setProvinceid(String provinceid) {
/* 49 */     this.provinceid = provinceid;
  }
  
  public String getCityid() {
/* 53 */     return this.cityid;
  }
  
  public void setCityid(String cityid) {
/* 56 */     this.cityid = cityid;
  }
  
  public String getAreaid() {
/* 60 */     return this.areaid;
  }
  
  public void setAreaid(String areaid) {
/* 63 */     this.areaid = areaid;
  }
  
  public String getPhone() {
/* 67 */     return this.phone;
  }
  
  public void setPhone(String phone) {
/* 70 */     this.phone = phone;
  }
  
  public String getAddress() {
/* 74 */     return this.address;
  }
  
  public void setAddress(String address) {
/* 77 */     this.address = address;
  }
  
  public String getContact() {
/* 81 */     return this.contact;
  }
  
  public void setContact(String contact) {
/* 84 */     this.contact = contact;
  }
  
  public String getIsDefault() {
/* 88 */     return this.isDefault;
  }
  
  public void setIsDefault(String isDefault) {
/* 91 */     this.isDefault = isDefault;
  }
  
  public String getAlias() {
/* 95 */     return this.alias;
  }
  
  public void setAlias(String alias) {
/* 98 */     this.alias = alias;
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/Address.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */