package com.hero.web.user.controller;

import com.hero.common.entity.Result;
import com.hero.common.pojo.User;
import com.hero.web.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"user"})
public class UserController {
  @Autowired
  private UserService userService;
  
  @RequestMapping({"/findByUsername/{username}"})
  public Result<User> findByUsername(@PathVariable("username") String username) {
/* 23 */     User user = this.userService.findByUsername(username);
/* 24 */     Result<User> result = new Result();
/* 25 */     result.setData(user);
/* 26 */     result.setCode(Integer.valueOf(20000));
/* 27 */     result.setMessage("查询成功");
/* 28 */     return result;
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/user/controller/UserController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */