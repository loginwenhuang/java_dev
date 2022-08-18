package com.wen.service.impl;

import com.wen.dao.IUserDao;
import com.wen.dao.impl.UserDaoImpl;
import com.wen.service.IUserService;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 9:08
 */
public class IUserServiceImpl implements IUserService {
    IUserDao userDao = new UserDaoImpl();
    @Override
    public Boolean login(String userName, String password) {
        return userDao.selectUser(userName,password)>0;
    }
}
