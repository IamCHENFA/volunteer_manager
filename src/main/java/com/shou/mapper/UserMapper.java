package com.shou.mapper;

import com.shou.pojo.Users;

import java.util.List;

/**
 * @author 11937
 */
public interface UserMapper {
    Users selectUserByAccountAndPassword(Users user);
    int selectUserByAccount(String account);
    int addUser(Users user);

    List<Users> selectAllTeachers();

    List<Users> selectAllStudents();

    int deleteUser(String account);
}
