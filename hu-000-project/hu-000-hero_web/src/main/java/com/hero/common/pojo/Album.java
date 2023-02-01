package com.hero.common.pojo;



import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_album")
public class Album implements Serializable {
  @Id
  private Long id;
  
  private String title;
  
  private String image;
  
  private String imageItems;
  
  public Long getId() {
/* 24 */     return this.id;
  }
  
  public void setId(Long id) {
/* 27 */     this.id = id;
  }
  
  public String getTitle() {
/* 31 */     return this.title;
  }
  
  public void setTitle(String title) {
/* 34 */     this.title = title;
  }
  
  public String getImage() {
/* 38 */     return this.image;
  }
  
  public void setImage(String image) {
/* 41 */     this.image = image;
  }
  
  public String getImageItems() {
/* 45 */     return this.imageItems;
  }
  
  public void setImageItems(String imageItems) {
/* 48 */     this.imageItems = imageItems;
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/Album.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */