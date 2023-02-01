package com.hero.web.goods.service.impl;

import com.hero.common.pojo.Order;
import com.hero.common.util.IdWorker;
import com.hero.web.goods.dao.OrderItemMapper;
import com.hero.web.goods.dao.OrderMapper;
import com.hero.web.goods.service.OrderService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
  @Autowired
  OrderMapper orderMapper;
  
  @Autowired
  private IdWorker idWorker;
  
  @Autowired
  OrderItemMapper orderItemMapper;
  
  public Order findById(String orderId) {
/* 66 */     return (Order)this.orderMapper.selectByPrimaryKey(orderId);
  }
  
  public void updateOrderPayStatus(String orderId, String transactionId) {
/* 71 */     Order order = (Order)this.orderMapper.selectByPrimaryKey(orderId);
/* 72 */     if (order != null && "0".equals(order.getPayStatus())) {
/* 74 */       order.setPayStatus("1");
/* 75 */       order.setOrderStatus("1");
/* 76 */       order.setUpdateTime(new Date());
/* 77 */       order.setPayTime(new Date());
/* 79 */       order.setTransactionId(transactionId);
/* 80 */       this.orderMapper.updateByPrimaryKeySelective(order);
    } 
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/service/impl/OrderServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */