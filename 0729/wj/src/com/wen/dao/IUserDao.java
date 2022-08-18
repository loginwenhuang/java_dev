package com.wen.dao;

import com.wen.entity.User;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 9:01
 */
public interface IUserDao {
    Integer selectUser(String userName, String password);
}
