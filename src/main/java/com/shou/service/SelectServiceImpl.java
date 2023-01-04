package com.shou.service;

import com.shou.mapper.SelectMapper;
import com.shou.pojo.ActScInfo;
import com.shou.pojo.Select;

import java.util.List;

public class SelectServiceImpl implements SelectService{

    private SelectMapper selectMapper;

    public void setSelectMapper(SelectMapper selectMapper) {
        this.selectMapper = selectMapper;
    }

    @Override
    public int addSelect(Select select) {
        return selectMapper.addSelect(select);
    }

    @Override
    public List<ActScInfo> selectByStudent(String account) {
        List<ActScInfo> actScInfoList = selectMapper.selectByStudent(account);
        return actScInfoList;
    }

    @Override
    public int deleteSelect(Select select) {
        return selectMapper.deleteSelect(select);
    }

    @Override
    public int deleteAllAboutAct(int vid) {
        return selectMapper.deleteAllAboutAct(vid);
    }
}
