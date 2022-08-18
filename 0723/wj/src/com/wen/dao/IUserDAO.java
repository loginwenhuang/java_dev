package com.wen.dao;

import com.wen.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/23 15:37
 */
public interface IUserDAO {
    /**
     * 根据用户和密码查询用户账号
     * @param userName
     * @param password
     * @return
     */
    User getByUserNameAndPassword(String userName,String password);

    /**
     * 判读用户名是否存在
     * @param userName
     * @return
     */
    boolean getByUserName(String userName);

    /**
     * 查询手机号是否存在
     * @param phone
     * @return
     */
    boolean getByPhone(String phone);

    /**
     * 新用户注册
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 全用户查询
     * @return
     */
    List<Map<String,Object>> getAllUser();

    /**
     * 用户修改
     * @param params
     * @return
     */
    boolean updateUser(Object[] params);
}
