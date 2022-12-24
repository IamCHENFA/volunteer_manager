package com.shou.mapper;

import com.shou.pojo.Users;

/**
 * @author 11937
 */
public interface IUserMapper {
    public int selectUserByAccountAndPassword(Users user);
}
