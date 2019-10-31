package com.dfbz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${user2.name}")
    String name;
    @Value("${user2.addr}")
    String addr;
    @Value("${user2.age}")
    Integer age;
    @Value("${cities[0]}")
    String city;

    @RequestMapping("/hellow")
    public String hellow(){
        return "hellow universe"+name+addr+age+city;
    }
}
