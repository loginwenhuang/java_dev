package com.wen.service;

import com.wen.entity.User;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 17:39
 */
public interface ILoginService {
    int userLogin(User user);
    int insertUser(User user);
}
