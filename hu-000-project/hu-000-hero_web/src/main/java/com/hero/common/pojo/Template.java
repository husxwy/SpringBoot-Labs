package com.hero.common.pojo;



import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_template")
public class Template implements Serializable {
  @Id
  private Integer id;
  
  private String name;
  
  private Integer specNum;
  
  private Integer paraNum;
  
  public Integer getId() {
/* 26 */     return this.id;
  }
  
  public void setId(Integer id) {
/* 29 */     this.id = id;
  }
  
  public String getName() {
/* 33 */     return this.name;
  }
  
  public void setName(String name) {
/* 36 */     this.name = name;
  }
  
  public Integer getSpecNum() {
/* 40 */     return this.specNum;
  }
  
  public void setSpecNum(Integer specNum) {
/* 43 */     this.specNum = specNum;
  }
  
  public Integer getParaNum() {
/* 47 */     return this.paraNum;
  }
  
  public void setParaNum(Integer paraNum) {
/* 50 */     this.paraNum = paraNum;
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/Template.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */