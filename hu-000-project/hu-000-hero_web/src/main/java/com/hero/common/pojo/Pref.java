package com.hero.common.pojo;



import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_pref")
public class Pref implements Serializable {
  @Id
  private Integer id;
  
  private Integer cateId;
  
  private Integer buyMoney;
  
  private Integer preMoney;
  
  private Date startTime;
  
  private Date endTime;
  
  private String type;
  
  private String state;
  
  public Integer getId() {
/* 30 */     return this.id;
  }
  
  public void setId(Integer id) {
/* 33 */     this.id = id;
  }
  
  public Integer getCateId() {
/* 37 */     return this.cateId;
  }
  
  public void setCateId(Integer cateId) {
/* 40 */     this.cateId = cateId;
  }
  
  public Integer getBuyMoney() {
/* 44 */     return this.buyMoney;
  }
  
  public void setBuyMoney(Integer buyMoney) {
/* 47 */     this.buyMoney = buyMoney;
  }
  
  public Integer getPreMoney() {
/* 51 */     return this.preMoney;
  }
  
  public void setPreMoney(Integer preMoney) {
/* 54 */     this.preMoney = preMoney;
  }
  
  public Date getStartTime() {
/* 58 */     return this.startTime;
  }
  
  public void setStartTime(Date startTime) {
/* 61 */     this.startTime = startTime;
  }
  
  public Date getEndTime() {
/* 65 */     return this.endTime;
  }
  
  public void setEndTime(Date endTime) {
/* 68 */     this.endTime = endTime;
  }
  
  public String getType() {
/* 72 */     return this.type;
  }
  
  public void setType(String type) {
/* 75 */     this.type = type;
  }
  
  public String getState() {
/* 79 */     return this.state;
  }
  
  public void setState(String state) {
/* 82 */     this.state = state;
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/Pref.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */