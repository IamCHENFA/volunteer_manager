package com.shou.mapper;

import com.shou.pojo.VoluntaryActivity;

import java.util.List;

public interface VoluntaryActivityMapper {
    // 添加活动
    int insertActivity(VoluntaryActivity voluntaryActivity);
    // 删除活动
    int deleteActivity(int vid);
    // 修改活动信息
    int updateActivity(VoluntaryActivity voluntaryActivity);
    List<VoluntaryActivity> selectAll(String account);

    List<VoluntaryActivity> selectByTeacher(String account);

    VoluntaryActivity selectByVid(int vid);
}
