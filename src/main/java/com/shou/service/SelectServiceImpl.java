package com.shou.service;

import com.shou.mapper.SelectMapper;
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
    public List<Select> selectByStudent(String account) {
        List<Select> selectList = selectMapper.selectByStudent(account);
        return selectList;
    }

    @Override
    public int deleteSelect(Select select) {
        return selectMapper.deleteSelect(select);
    }
}
