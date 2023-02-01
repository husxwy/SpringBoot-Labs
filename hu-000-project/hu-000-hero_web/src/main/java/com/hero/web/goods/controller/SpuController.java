package com.hero.web.goods.controller;

import com.hero.common.entity.Result;
import com.hero.common.pojo.Goods;
import com.hero.web.goods.service.SpuService;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/spu"})
public class SpuController {
  @Autowired
  private SpuService spuService;
  
  @PostMapping({"/addGoods"})
  public Result addGoods(@RequestBody Goods goods) {
/* 25 */     this.spuService.addGoods(goods);
/* 26 */     return new Result(true, Integer.valueOf(20000), "新增商品成功");
  }
  
  @GetMapping({"/goods/{spuId}"})
  public Result findGoodsBySpuId(@PathVariable String spuId) {
/* 31 */     Goods goods = this.spuService.findBySpuId(spuId);
/* 32 */     return new Result(true, Integer.valueOf(20000), "查询成功", goods);
  }
  
  @GetMapping({"/goods/slow/{spuId}"})
  public Result findGoodsBySpuIdTwo(@PathVariable String spuId) {
/* 38 */     Goods goods = this.spuService.findBySpuId(spuId);
    try {
/* 42 */       TimeUnit.MILLISECONDS.sleep(500L);
/* 43 */     } catch (InterruptedException e) {
/* 44 */       e.printStackTrace();
    } 
/* 46 */     return new Result(true, Integer.valueOf(20000), "查询成功", goods);
  }
  
  @PutMapping({"/updateGoods"})
  public Result updateGoods(@RequestBody Goods goods) {
/* 52 */     this.spuService.updateGoods(goods);
/* 53 */     return new Result(true, Integer.valueOf(20000), "更新成功");
  }
  
  @PutMapping({"/auditGoods/{spuId}"})
  public Result auditGoods(@PathVariable String spuId) {
/* 58 */     this.spuService.auditGoods(spuId);
/* 59 */     return new Result(true, Integer.valueOf(20000), "审核成功");
  }
  
  @PutMapping({"/upGoods/{spuId}"})
  public Result upGoods(@PathVariable String spuId) {
/* 64 */     this.spuService.upGoods(spuId);
/* 65 */     return new Result(true, Integer.valueOf(20000), "上架成功");
  }
  
  @PutMapping({"/downGoods/{spuId}"})
  public Result downGoods(@PathVariable String spuId) {
/* 71 */     this.spuService.downGoods(spuId);
/* 72 */     return new Result(true, Integer.valueOf(20000), "下架成功");
  }
  
  @PutMapping({"/deleteLogic/{spuId}"})
  public Result deleteLogic(@PathVariable String spuId) {
/* 78 */     this.spuService.deleteLogic(spuId);
/* 79 */     return new Result(true, Integer.valueOf(20000), "逻辑删除成功");
  }
  
  @PutMapping({"/restore/{spuId}"})
  public Result restore(@PathVariable String spuId) {
/* 85 */     this.spuService.restore(spuId);
/* 86 */     return new Result(true, Integer.valueOf(20000), "恢复商品成功");
  }
  
  @PutMapping({"/deleteGoods/{spuId}"})
  public Result deleteGoods(@PathVariable String spuId) {
/* 92 */     this.spuService.deleteGoods(spuId);
/* 93 */     return new Result(true, Integer.valueOf(20000), "物理删除成功");
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/controller/SpuController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */