package com.wen.service.impl;

import com.wen.dao.ILoginAndRegisterDao;
import com.wen.dao.impl.LoginAndRegisterDao;
import com.wen.entity.User;
import com.wen.service.ILoginAndRegisterService;

/**
 * @author :muxiaowen
 * @date : 2022/7/27 17:01
 */
public class LoginAndRegisterService implements ILoginAndRegisterService {
    ILoginAndRegisterDao loginAndRegisterDao = new LoginAndRegisterDao();
    User user = null;
    @Override
    public Integer userLogin(String userName, String password) {
        user = new User(userName,password);
        return loginAndRegisterDao.userLogin(user);
    }

    @Override
    public Boolean userRegister(String userName, String password) {
        user = new User(userName,password);
        return loginAndRegisterDao.userRegister(user)>0;
    }

    @Override
    public Boolean checkUserName(String userName) {
        return loginAndRegisterDao.selectByUserName(userName)>0;
    }
}
