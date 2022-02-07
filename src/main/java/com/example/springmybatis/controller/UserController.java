package com.example.springmybatis.controller;

import com.example.springmybatis.entity.User;
import com.example.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user") // 给user模块增加统一请求前缀
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public User GetUser(@PathVariable int id) {
        User user = userService.Sel(id);
        return user;
    }

}
