package com.wen.util;

import com.wen.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/24 20:52
 */
public class PackUser {
    public static User packUser(Map map){
        User  user = new User();
        user.setUserId((Integer) map.get("user_id"));
        user.setUserName((String)map.get("user_name"));
        user.setPassword((String)map.get("user_password"));
        user.setNickName((String)map.get("user_nickname"));
        user.setSex((String)map.get("user_sex"));
        user.setPhone((String)map.get("user_phone"));
        return user;
    }
}
