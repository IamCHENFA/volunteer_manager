package com.shou.service;

import com.shou.mapper.IUserMapper;
import com.shou.pojo.Users;

public class UserServiceImpl implements UserService{
    private IUserMapper userMapper;

    public void setUserMapper(IUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public Users selectUser(Users users) {
        return userMapper.selectUserByAccountAndPassword(users);
    }

    @Override
    public int addUser(Users user) {
        //加之前查询一下是否存在
        int isExist = userMapper.selectUserByAccount(user.getAccount());
        if(isExist == 1){
            return 0;
        }
        return userMapper.addUser(user);
    }
}
