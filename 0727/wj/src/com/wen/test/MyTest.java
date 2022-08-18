package com.wen.test;

import com.wen.dao.ILoginAndRegisterDao;
import com.wen.dao.impl.LoginAndRegisterDao;
import com.wen.entity.User;

/**
 * @author :muxiaowen
 * @date : 2022/7/27 17:22
 */
public class MyTest {
    public static void main(String[] args) {
        ILoginAndRegisterDao loginAndRegisterDao = new LoginAndRegisterDao();
        User usr =new User("admin","123456");
        int n = loginAndRegisterDao.userLogin(usr);
        System.out.println(n);
    }
}
