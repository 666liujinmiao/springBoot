package com.dfbz.controller;

import com.dfbz.entity.User;
import com.dfbz.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userMapper.findAll();
    }
}
