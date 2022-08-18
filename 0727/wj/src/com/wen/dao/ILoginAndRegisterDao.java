package com.wen.dao;

import com.wen.entity.User;

/**
 * @author :muxiaowen
 * @date : 2022/7/27 16:41
 */
public interface ILoginAndRegisterDao {
    /**
     * 登录
     * @param user
     * @return
     */
    Integer userLogin(User user);

    /**
     * 注册
     * @param user
     * @return
     */
    Integer userRegister(User user);
}
