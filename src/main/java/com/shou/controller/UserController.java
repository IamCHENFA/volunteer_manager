package com.shou.controller;

import com.shou.pojo.Users;
import com.shou.pojo.VoluntaryActivity;
import com.shou.service.UserService;
import com.shou.service.VoluntaryActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;
    @Autowired
    @Qualifier("activityServiceImpl")
    private VoluntaryActivityService activityService;

    @RequestMapping("/login")
    public ModelAndView login(Users user, HttpServletRequest request) {
        System.out.println(user);
        ModelAndView mv = new ModelAndView();
        Users tUser = userService.selectUser(user);
        if(tUser == null){
            mv.addObject("msg","登陆失败，请重试！");
            mv.setViewName("index");
        }else{
            //实现后续访问该用户信息
            HttpSession session = request.getSession();
            if(session.getAttribute("user")!=null){
                session.removeAttribute("user");
            }
            session.setAttribute("user", tUser);

            switch (tUser.getIdentity()){
                case "学生":
                    List<VoluntaryActivity> activityList = activityService.selectAll();
                    for (VoluntaryActivity activity : activityList) {
                        System.out.println(activity);
                    }
                    mv.addObject("activityList", activityList);
                    mv.setViewName("helloStudent");
                    break;
                case "教师":
                    List<VoluntaryActivity> activityListT = activityService.selectByTeacher(user.getAccount());
                    mv.addObject("activityListT", activityListT);
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
