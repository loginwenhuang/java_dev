package com.wen.dao.impl;

import com.wen.dao.IUserDAO;
import com.wen.entity.User;
import com.wen.util.BaseDAO;
import com.wen.util.PackUser;
import org.junit.Test;

import javax.crypto.interfaces.PBEKey;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/23 16:38
 */
public class UserDAO implements IUserDAO {
    private List<Map<String,Object>> row = null;
    private Object[] params;
    @Override
    public User getByUserNameAndPassword(String userName, String password) {
        String sql = "select user_id,user_name,user_password,user_nickname,user_sex,user_phone" +
                "   from users  " +
                "   where user_name = ? and user_password = ? ";
        params = new Object[]{userName, password};
        BaseDAO.setPst(sql,params);
        row = BaseDAO.executeQuery();
        if(row.size()>0){
            Map map = row.get(0);
            return PackUser.packUser(map);
        }
        return null;
    }

    @Override
    public boolean getByUserName(String userName) {
        String sql = "select user_id from users where user_name = ?";
        params = new Object[]{userName};
        BaseDAO.setPst(sql,params);
        row = BaseDAO.executeQuery();
        return row.size()>0;
    }

    @Override
    public boolean getByPhone(String phone) {
        String sql = "select user_id from users where user_phone = ?";
        params = new Object[]{phone};
        BaseDAO.setPst(sql,params);
        row = BaseDAO.executeQuery();
        return row.size()>0;
    }

    @Override
    public int insert(User user) {
        String sql = "insert into users(user_name, user_password, user_nickname, user_sex, user_phone)" +
                "   value " +
                "   (?,?,?,?,?)";
        params = new Object[]{
                user.getUserName(),
                user.getPassword(),
                user.getNickName(),
                user.getSex(),
                user.getPhone()
        };
        BaseDAO.setPst(sql,params);
        return BaseDAO.executeUpdate();
    }

    @Override
    public List<Map<String, Object>> getAllUser() {
        String sql = "select user_id,user_name, user_password, user_nickname, user_sex, user_phone " +
                "   from users";
        BaseDAO.setPst(sql,null);
        row = BaseDAO.executeQuery();
        if(row.size()>0){
            return  row;
        }
        return null;
    }

    @Override
    public boolean updateUser(Object[] params) {
        String sql = "update `users` " +
                "   set  user_name = ?," +
                "   user_password = ?," +
                "   user_nickname = ?," +
                "   user_phone = ?" +
                "   where user_id = ?";
        BaseDAO.setPst(sql,params);
        if(BaseDAO.executeUpdate()==1){
            return true;
        }
        return false;
    }
}
