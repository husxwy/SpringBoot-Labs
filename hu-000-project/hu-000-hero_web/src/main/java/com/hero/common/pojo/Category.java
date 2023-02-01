package com.hero.common.pojo;



import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_category")
public class Category implements Serializable {
  @Id
  private Integer id;
  
  private String name;
  
  private Integer goodsNum;
  
  private String isShow;
  
  private String isMenu;
  
  private Integer seq;
  
  private Integer parentId;
  
  private Integer templateId;
  
  public Integer getId() {
/* 30 */     return this.id;
  }
  
  public void setId(Integer id) {
/* 33 */     this.id = id;
  }
  
  public String getName() {
/* 37 */     return this.name;
  }
  
  public void setName(String name) {
/* 40 */     this.name = name;
  }
  
  public Integer getGoodsNum() {
/* 44 */     return this.goodsNum;
  }
  
  public void setGoodsNum(Integer goodsNum) {
/* 47 */     this.goodsNum = goodsNum;
  }
  
  public String getIsShow() {
/* 51 */     return this.isShow;
  }
  
  public void setIsShow(String isShow) {
/* 54 */     this.isShow = isShow;
  }
  
  public String getIsMenu() {
/* 58 */     return this.isMenu;
  }
  
  public void setIsMenu(String isMenu) {
/* 61 */     this.isMenu = isMenu;
  }
  
  public Integer getSeq() {
/* 65 */     return this.seq;
  }
  
  public void setSeq(Integer seq) {
/* 68 */     this.seq = seq;
  }
  
  public Integer getParentId() {
/* 72 */     return this.parentId;
  }
  
  public void setParentId(Integer parentId) {
/* 75 */     this.parentId = parentId;
  }
  
  public Integer getTemplateId() {
/* 79 */     return this.templateId;
  }
  
  public void setTemplateId(Integer templateId) {
/* 82 */     this.templateId = templateId;
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/Category.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */