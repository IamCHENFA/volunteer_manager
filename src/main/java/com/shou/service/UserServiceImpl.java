package com.shou.service;

import com.shou.mapper.IUserMapper;
import com.shou.pojo.Users;

public class UserServiceImpl implements UserService{
    private IUserMapper userMapper;

    public void setUserMapper(IUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int selectUser(Users users) {
        return userMapper.selectUserByAccountAndPassword(users);
    }
}
