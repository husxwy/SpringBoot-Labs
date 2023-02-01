package com.hero.web.goods.service;

import com.hero.common.entity.Result;
import com.hero.common.pojo.Address;
import java.util.List;

public interface AddressService {
  Result<List<Address>> list(String paramString);
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/goods/service/AddressService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */