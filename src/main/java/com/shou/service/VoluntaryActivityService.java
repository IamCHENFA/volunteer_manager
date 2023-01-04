package com.shou.service;

import com.shou.pojo.VoluntaryActivity;

import java.util.List;

public interface VoluntaryActivityService {

    //添加活动
    int insertActivity(VoluntaryActivity voluntaryActivity);

    // 删除活动
    int deleteActivity(int vid);

    // 修改活动信息
    int updateActivity(VoluntaryActivity voluntaryActivity);

    //查询所有活动
    List<VoluntaryActivity> selectAll(String account);

    List<VoluntaryActivity> selectByTeacher(String account);

    VoluntaryActivity selectByVid(int vid);
}
