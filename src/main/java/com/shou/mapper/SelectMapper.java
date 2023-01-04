package com.shou.mapper;

import com.shou.pojo.Select;

import java.util.List;

public interface SelectMapper {
    int addSelect(Select select);

    List<Select> selectByStudent(String account);

    int deleteSelect(Select select);
}
