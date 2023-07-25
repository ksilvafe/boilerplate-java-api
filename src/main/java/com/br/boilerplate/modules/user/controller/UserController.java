package com.br.boilerplate.modules.user.controller;

import com.br.boilerplate.modules.user.domain.User;
import com.br.boilerplate.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class UserController {

  @Autowired
  UserService userService;

  @PostMapping("/users")
  public User create(@RequestBody User user) {
    return userService.execute(user);
  }
}