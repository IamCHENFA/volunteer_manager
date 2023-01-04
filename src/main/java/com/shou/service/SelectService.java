package com.shou.service;

import com.shou.pojo.ActScInfo;
import com.shou.pojo.Select;

import java.util.List;

public interface SelectService {
    int addSelect(Select select);

    public List<ActScInfo> selectByStudent(String account);

    int deleteSelect(Select select);

    int deleteAllAboutAct(int vid);
}
