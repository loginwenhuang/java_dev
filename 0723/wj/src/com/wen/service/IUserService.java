package com.wen.service;

/**
 * @author :muxiaowen
 * @date : 2022/7/23 16:30
 */
public interface IUserService {
    /**
     * 用户登录
     * @return
     */
    boolean login();

    /**
     * 注册
     * @return
     */
    boolean register();
    /**
     * 删除用户
     * @param user_id
     * @return
     */
    boolean deleteUser(String user_id);

    /**
     * 修改用户
     * @param user_id
     * @return
     */
    boolean modifyUser(String user_id);

    /**
     * 显示所有用户
     * @return
     */
    void showAllUser();
}
