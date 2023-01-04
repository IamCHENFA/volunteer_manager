package com.shou.controller;

import com.shou.pojo.Users;
import com.shou.pojo.VoluntaryActivity;
import com.shou.service.VoluntaryActivityService;
import com.shou.service.VoluntaryActivityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class VoluntaryActivityController {
    @Autowired
    @Qualifier("activityServiceImpl")
    private VoluntaryActivityService activityService;


    @RequestMapping("/addNewActivity")
    public ModelAndView addNewActivity(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("addNewActivity");
        return mv;
    }
    @RequestMapping("doAddNewActivity")
    public ModelAndView doAddNewActivity(HttpServletRequest request, VoluntaryActivity voluntaryActivity){
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        Users user = (Users) session.getAttribute("user");
        voluntaryActivity.setManagementTeacherAccount(user.getAccount());
        System.out.println(voluntaryActivity);
        activityService.insertActivity(voluntaryActivity);
        List<VoluntaryActivity> activityListT = activityService.selectByTeacher(user.getAccount());
        mv.addObject("activityListT", activityListT);
        mv.setViewName("helloTeacher");
        return mv;
    }

}
