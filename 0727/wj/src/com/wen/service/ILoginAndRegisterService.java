package com.wen.service;

/**
 * @author :muxiaowen
 * @date : 2022/7/27 16:59
 */
public interface ILoginAndRegisterService {
    /**
     * 用户登录
     * @param userName
     * @param password
     * @return
     */
    Integer userLogin(String userName,String password);

    /**
     * 用户注册
     * @param userName
     * @param password
     * @return
     */
    Boolean userRegister(String userName,String password);
}
