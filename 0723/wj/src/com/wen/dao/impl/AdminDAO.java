package com.wen.dao.impl;

import com.wen.dao.IAdminDAO;
import com.wen.entity.Admin;
import com.wen.util.BaseDAO;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/23 17:53
 */
public class AdminDAO implements IAdminDAO {
    Object[] params = null;
    private List<Map<String,Object>> row = null;
    Admin admin = null;
    @Override
    public Admin verifyAccountAndPassword(String account, String password) {
        String sql = "select `admin`,password" +
                "    from `admin` " +
                "   where `admin`= ? and password= ?";
        params = new Object[]{account,password};
        BaseDAO.setPst(sql,params);
        row = BaseDAO.executeQuery();
        if(row.size()>0){
            Map map = row.get(0);
            admin = new Admin((String)map.get("admin"),(String)map.get("password"));
        }
        return admin;
    }
}
