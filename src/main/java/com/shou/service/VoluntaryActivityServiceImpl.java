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
    public List<VoluntaryActivity> selectAll(String account) {
        List<VoluntaryActivity> vList = activityMapper.selectAll(account);
        return vList;
    }

    @Override
    public List<VoluntaryActivity> selectByTeacher(String account) {
        List<VoluntaryActivity> vList = activityMapper.selectByTeacher(account);
        return vList;
    }

    @Override
    public VoluntaryActivity selectByVid(int vid) {
        return activityMapper.selectByVid(vid);
    }

    @Override
    public int deleteAllAboutTeacher(String account) {
        return activityMapper.deleteAllAboutTeacher(account);
    }
}
