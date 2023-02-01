package com.hero.web.goods.service.impl;

import com.hero.common.entity.Result;
import com.hero.common.pojo.Address;
import com.hero.web.goods.dao.AddressMapper;
import com.hero.web.goods.service.AddressService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
  @Autowired
  AddressMapper addressMapper;
  
  public Result<List<Address>> list(String username) {
/* 21 */     Address address = new Address();
/* 22 */     address.setUsername(username);
/* 23 */     List<Address> addressList = this.addressMapper.select(address);
/* 24 */     Result<List<Address>> result = new Result();
/* 25 */     result.setData(addressList);
/* 26 */     return result;
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/service/impl/AddressServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */