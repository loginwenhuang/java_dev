package com.wen.dao;

import com.wen.entity.Admin;

/**
 * @author :muxiaowen
 * @date : 2022/7/23 17:49
 */
public interface IAdminDAO {
    /**
     * 管理员登录验证
     * @param account
     * @param password
     * @return
     */
    Admin verifyAccountAndPassword(String account, String password);
}
