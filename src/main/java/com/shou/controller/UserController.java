package com.shou.controller;

import com.shou.pojo.Users;
import com.shou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(Users user) {
        ModelAndView mv = new ModelAndView();
        Users tUser = userService.selectUser(user);
        if(tUser == null){
            mv.addObject("msg","登陆失败，请重试！");
            mv.setViewName("index");
        }else{
            System.out.println(user);
            switch (tUser.getIdentity()){
                case "学生":
                    mv.setViewName("helloStudent");
                    break;
                case "教师":
                    mv.setViewName("helloTeacher");
                    break;
                case "管理员":
                    mv.setViewName("helloAdmin");
                    break;
            }
        }
        return mv;
    }


    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("/doRegister")
    public ModelAndView doRegister(Users user){
        ModelAndView mv = new ModelAndView();
        user.setIdentity("学生");
        if(userService.addUser(user) == 0){
            mv.addObject("msg","注册失败，账号已存在");
            mv.setViewName("/index");
        }else{
            mv.setViewName("helloStudent");
        }
        return mv;
    }
}
