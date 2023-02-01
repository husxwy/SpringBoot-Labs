package com.hero.common.pojo;



import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_brand")
public class Brand implements Serializable {
  @Id
  private Integer id;
  
  private String name;
  
  private String image;
  
  private String letter;
  
  private Integer seq;
  
  public Integer getId() {
/* 23 */     return this.id;
  }
  
  public void setId(Integer id) {
/* 26 */     this.id = id;
  }
  
  public String getName() {
/* 30 */     return this.name;
  }
  
  public void setName(String name) {
/* 33 */     this.name = name;
  }
  
  public String getImage() {
/* 37 */     return this.image;
  }
  
  public void setImage(String image) {
/* 40 */     this.image = image;
  }
  
  public String getLetter() {
/* 44 */     return this.letter;
  }
  
  public void setLetter(String letter) {
/* 47 */     this.letter = letter;
  }
  
  public Integer getSeq() {
/* 51 */     return this.seq;
  }
  
  public void setSeq(Integer seq) {
/* 54 */     this.seq = seq;
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/Brand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */