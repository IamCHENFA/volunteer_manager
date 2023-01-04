package com.shou.service;

import com.shou.pojo.Select;

import java.util.List;

public interface SelectService {
    int addSelect(Select select);

    List<Select> selectByStudent(String account);

    int deleteSelect(Select select);
}
