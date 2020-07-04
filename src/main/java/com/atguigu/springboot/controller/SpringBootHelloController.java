package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootHelloController {

    @Autowired
    User user;

    @RequestMapping("/ok")
    public String hello(){
        System.out.println(user);
        return "lisa!!";
    }
}
