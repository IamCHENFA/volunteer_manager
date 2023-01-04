package com.shou.service;

import com.shou.mapper.VoluntaryActivityMapper;
import com.shou.pojo.VoluntaryActivity;

import java.util.List;

public class VoluntaryActivityServiceImpl implements VoluntaryActivityService{
    private VoluntaryActivityMapper activityMapper;

    public void setActivityMapper(VoluntaryActivityMapper activityMapper) {
        this.activityMapper = activityMapper;
    }

    @Override
    public int insertActivity(VoluntaryActivity voluntaryActivity) {
        return activityMapper.insertActivity(voluntaryActivity);
    }

    @Override
    public int deleteActivity(int vid) {
        return activityMapper.deleteActivity(vid);
    }

    @Override
    public int updateActivity(VoluntaryActivity voluntaryActivity) {
        return activityMapper.updateActivity(voluntaryActivity);
    }

    @Override
    public List<VoluntaryActivity> selectAll() {
        List<VoluntaryActivity> vList = activityMapper.selectAll();
        return vList;
    }

    @Override
    public List<VoluntaryActivity> selectByTeacher(String account) {
        List<VoluntaryActivity> vList = activityMapper.selectByTeacher(account);
        return vList;
    }
}
