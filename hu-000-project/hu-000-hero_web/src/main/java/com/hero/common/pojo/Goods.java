package com.hero.common.pojo;



import com.hero.common.pojo.Sku;
import com.hero.common.pojo.Spu;
import java.io.Serializable;
import java.util.List;

public class Goods implements Serializable {
  private Spu spu;
  
  private List<Sku> skuList;
  
  public Spu getSpu() {
/* 16 */     return this.spu;
  }
  
  public void setSpu(Spu spu) {
/* 20 */     this.spu = spu;
  }
  
  public List<Sku> getSkuList() {
/* 24 */     return this.skuList;
  }
  
  public void setSkuList(List<Sku> skuList) {
/* 28 */     this.skuList = skuList;
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/Goods.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */