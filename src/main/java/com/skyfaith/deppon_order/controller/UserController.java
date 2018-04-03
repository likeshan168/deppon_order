package com.skyfaith.deppon_order.controller;

import com.skyfaith.deppon_order.entity.User;
import com.skyfaith.deppon_order.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showuser")
    @ResponseBody
    public User toIndex(HttpServletRequest request, Model model){
        int userid=Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUerById(userid);
        return user;
    }

}
