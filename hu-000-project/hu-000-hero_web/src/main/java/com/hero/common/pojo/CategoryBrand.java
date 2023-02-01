package com.hero.common.pojo;



import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_category_brand")
public class CategoryBrand implements Serializable {
  @Id
  private Integer categoryId;
  
  @Id
  private Integer brandId;
  
  public Integer getCategoryId() {
/* 17 */     return this.categoryId;
  }
  
  public void setCategoryId(Integer categoryId) {
/* 21 */     this.categoryId = categoryId;
  }
  
  public Integer getBrandId() {
/* 25 */     return this.brandId;
  }
  
  public void setBrandId(Integer brandId) {
/* 29 */     this.brandId = brandId;
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/CategoryBrand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */