package com.shou.controller;

import com.shou.pojo.Users;
import com.shou.pojo.VoluntaryActivity;
import com.shou.service.SelectService;
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
    @Autowired
    @Qualifier("selectServiceImpl")
    private SelectService selectService;

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
        activityService.insertActivity(voluntaryActivity);
        List<VoluntaryActivity> activityListT = activityService.selectByTeacher(user.getAccount());
        mv.addObject("activityListT", activityListT);
        mv.setViewName("helloTeacher");
        return mv;
    }
    @RequestMapping("/helloStudent")
    public ModelAndView helloStudent(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        Users user = (Users) session.getAttribute("user");
        List<VoluntaryActivity> activityList = activityService.selectAll(user.getAccount());
        mv.addObject("activityList", activityList);
        mv.setViewName("helloStudent");
        return mv;
    }
    //教师更新活动
    @RequestMapping("updateAct")
    public ModelAndView updateAct(int vid){
        ModelAndView mv = new ModelAndView();
        VoluntaryActivity activity = activityService.selectByVid(vid);
        mv.addObject("activity", activity);
        mv.setViewName("updateAct");
        return mv;
    }

    @RequestMapping("/doUpdateAct")
    public ModelAndView doUpdateAct(VoluntaryActivity activity){
        ModelAndView mv = new ModelAndView();
        activityService.updateActivity(activity);
        List<VoluntaryActivity> activityListT = activityService.selectByTeacher(activity.getManagementTeacherAccount());
        mv.addObject("activityListT", activityListT);
        mv.setViewName("helloTeacher");
        return mv;
    }
    @RequestMapping("isDeleteAct")
    public ModelAndView isDeleteAct(int vid, String t){
        ModelAndView mv = new ModelAndView();
        selectService.deleteAllAboutAct(vid);
        activityService.deleteActivity(vid);
        List<VoluntaryActivity> activityListT = activityService.selectByTeacher(t);
        mv.addObject("activityListT", activityListT);
        mv.setViewName("helloTeacher");
        return mv;
    }
}
