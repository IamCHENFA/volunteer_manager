package com.shou.service;

import com.shou.pojo.Users;

public interface UserService {
    Users selectUser(Users users);

    int addUser(Users user);
}
