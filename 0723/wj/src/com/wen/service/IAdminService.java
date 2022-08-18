package com.wen.service;

/**
 * @author :muxiaowen
 * @date : 2022/7/23 17:44
 */
public interface IAdminService {
    /**
     * 管理员登录
     * @return
     */
    boolean login();

    /**
     * 用户管理
     * @return
     */
    void userManagement();

    /**
     * 书籍管理
     * @return
     */
    boolean bookManagement();


}
