package com.skyfaith.deppon_order.controller;


import com.skyfaith.deppon_order.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {
    @RequestMapping("getuser")
    public User getUser(){
        User user = new User();
        user.setNickname("test");
        return user;
    }
}
