package com.shou.mapper;

import com.shou.pojo.Users;

/**
 * @author 11937
 */
public interface UserMapper {
    Users selectUserByAccountAndPassword(Users user);
    int selectUserByAccount(String account);
    int addUser(Users user);
}
