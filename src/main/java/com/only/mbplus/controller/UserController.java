package com.only.mbplus.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.only.mbplus.entity.User;
import com.only.mbplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("createUser")
    public Integer createUser() {
        User user = new User();
        user.setId(Long.valueOf(new Random().nextInt()));
        user.setUserName("aaa");
        user.setPassWord("123");
        user.setName("sddsdsddsd");
        return userMapper.insert(user);
    }

    @GetMapping("getUserList")
    public List<User> getUserList() {
        return userMapper.selectPage(new Page<>(1, 5), null);
    }

    @GetMapping("helloWorld")
    public String helloWorld() {
        return "hello world";
    }
}
