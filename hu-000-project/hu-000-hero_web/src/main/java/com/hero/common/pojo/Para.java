package com.hero.common.pojo;



import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_para")
public class Para implements Serializable {
  @Id
  private Integer id;
  
  private String name;
  
  private String options;
  
  private Integer seq;
  
  private Integer templateId;
  
  public Integer getId() {
/* 27 */     return this.id;
  }
  
  public void setId(Integer id) {
/* 30 */     this.id = id;
  }
  
  public String getName() {
/* 34 */     return this.name;
  }
  
  public void setName(String name) {
/* 37 */     this.name = name;
  }
  
  public String getOptions() {
/* 41 */     return this.options;
  }
  
  public void setOptions(String options) {
/* 44 */     this.options = options;
  }
  
  public Integer getSeq() {
/* 48 */     return this.seq;
  }
  
  public void setSeq(Integer seq) {
/* 51 */     this.seq = seq;
  }
  
  public Integer getTemplateId() {
/* 55 */     return this.templateId;
  }
  
  public void setTemplateId(Integer templateId) {
/* 58 */     this.templateId = templateId;
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/Para.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */