package com.shou.controller;

import com.shou.pojo.Users;
import com.shou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @RequestMapping("/login")
    public String login(Users user) {
        String ret;
        int a = userService.selectUser(user);
        System.out.println(user);
        if(a==1){
            ret = "hello";
        }else{
            ret = "defeat";
        }
        return ret;
    }
}
