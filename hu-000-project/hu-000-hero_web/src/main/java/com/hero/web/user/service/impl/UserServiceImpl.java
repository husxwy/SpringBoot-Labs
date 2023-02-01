package com.hero.web.user.service.impl;

import com.hero.common.pojo.User;
import com.hero.web.user.dao.UserMapper;
import com.hero.web.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
/* 15 */   private static final Logger log = LoggerFactory.getLogger(com.hero.web.user.service.impl.UserServiceImpl.class);
  
  @Autowired
  private UserMapper userMapper;
  
  public User findByUsername(String username) {
/* 23 */     User user = (User)this.userMapper.selectByPrimaryKey(username);
/* 33 */     return user;
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/user/service/impl/UserServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */