package com.shou.controller;

import com.shou.pojo.ActScInfo;
import com.shou.pojo.Select;
import com.shou.pojo.Users;
import com.shou.pojo.VoluntaryActivity;
import com.shou.service.SelectService;
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
public class SelectController {
    @Autowired
    @Qualifier("selectServiceImpl")
    private SelectService selectService;
    @Autowired
    @Qualifier("activityServiceImpl")
    private VoluntaryActivityService activityService;


    @RequestMapping("/studentSelectList")
    public ModelAndView studentSelectList(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        Select select = new Select();
        Users user = (Users) session.getAttribute("user");
        System.out.println(user);
        List<ActScInfo> actScInfoList = selectService.selectByStudent(user.getAccount());

        for (ActScInfo actScInfo : actScInfoList) {
            System.out.println(actScInfo);
        }

        mv.addObject("actScInfoList", actScInfoList);
        mv.setViewName("studentSelectList");
        return mv;
    }
    @RequestMapping("isSelect")
    public ModelAndView isSelect(HttpServletRequest request, int vid){
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        Users user = (Users) session.getAttribute("user");
        Select select = new Select();
        select.setVid(vid);
        select.setSAccount(user.getAccount());
        selectService.addSelect(select);
        List<VoluntaryActivity> activityList = activityService.selectAll(user.getAccount());
        mv.addObject("activityList", activityList);
        mv.setViewName("helloStudent");
        return mv;
    }
    @RequestMapping("isDelete")
    public ModelAndView isDelete(HttpServletRequest request, int vid){
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        Users user = (Users) session.getAttribute("user");
        Select select = new Select();
        select.setVid(vid);
        select.setSAccount(user.getAccount());
        selectService.deleteSelect(select);
        List<ActScInfo> actScInfoList = selectService.selectByStudent(user.getAccount());
        mv.addObject("actScInfoList", actScInfoList);
        mv.setViewName("studentSelectList");
        return mv;
    }
    @RequestMapping("/addScore")
    public ModelAndView addScore(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        Users user = (Users) session.getAttribute("user");
        List<ActScInfo> actScInfoList = selectService.selectByTeacher(user.getAccount());
        mv.addObject("actScInfoList", actScInfoList);
        mv.setViewName("addScore");
        return mv;
    }
    @RequestMapping("doAddScore")
    public ModelAndView doAddScore(HttpServletRequest request,String account, Integer vid, Integer score){
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        Select select = new Select(account, vid, score);
        System.out.println(select);
        selectService.updateScore(select);
        Users user = (Users) session.getAttribute("user");
        List<ActScInfo> actScInfoList = selectService.selectByTeacher(user.getAccount());
        mv.addObject("actScInfoList", actScInfoList);
        mv.setViewName("addScore");
        return mv;
    }
}
