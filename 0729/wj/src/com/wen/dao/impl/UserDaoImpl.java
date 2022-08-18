package com.wen.dao.impl;

import com.wen.dao.IUserDao;
import com.wen.entity.User;
import com.wen.util.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 9:02
 */
public class UserDaoImpl implements IUserDao {
    @Override
    public Integer selectUser(String userName, String password) {
        String sql="select userId from user where userName = ? and password = ?";
        BaseDao.setPst(sql,new Object[]{userName,password});
        List<Map<String,Object>> rows = BaseDao.executeQuery();
        if(rows.size()>0){
            return (Integer) rows.get(0).get("userId");
        }
        return -1;
    }
}
