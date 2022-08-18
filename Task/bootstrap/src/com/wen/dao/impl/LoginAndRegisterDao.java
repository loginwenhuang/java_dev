package com.wen.dao.impl;

import com.wen.dao.ILoginAndRegisterDao;
import com.wen.entity.User;
import com.wen.util.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/27 16:49
 */
public class LoginAndRegisterDao implements ILoginAndRegisterDao {
    @Override
    public Integer userLogin(User user) {
        String sql = "select userId from user where userName = ? and password = ?";
        BaseDao.setPst(sql,new Object[]{user.getUserName(),user.getPassword()});
        int userId = -1;
        List<Map<String,Object>> rows = BaseDao.executeQuery();
        if(rows.size()!=0){
            userId = (Integer)rows.get(0).get("userId");
        }
        return userId;
    }

    @Override
    public Integer userRegister(User user) {
        String sql = "insert into user(userName,password) value (?,?) ";
        BaseDao.setPst(sql,new Object[]{user.getUserName(),user.getPassword()});
        return BaseDao.executeUpdate();
    }

    @Override
    public Integer selectByUserName(String userName) {
        String sql = "select count(userId) from user where userName = ?";
        BaseDao.setPst(sql,new Object[]{userName});
        return BaseDao.executeQuery().size();
    }
}
