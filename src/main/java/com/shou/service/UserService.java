package com.shou.service;

import com.shou.pojo.Users;

import java.util.List;

public interface UserService {
    Users selectUser(Users users);

    int addUser(Users user);
    List<Users> selectAllTeachers();

    List<Users> selectAllStudents();

    int deleteUser(String account);
}
