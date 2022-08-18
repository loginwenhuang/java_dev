package com.wen.dao.impl;

import com.wen.dao.IStudentDao;
import com.wen.enity.Student;
import com.wen.util.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 9:06
 */
public class IStudentDaoImpl implements IStudentDao {
    @Override
    public boolean insertStu(Object[] params) {
        String sql = "insert into student(stuName,sex,birthday)" +
                "   value (?,?,?)";
        BaseDao.setPst(sql,params);
        if(BaseDao.executeUpdate()>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateStu(Object[] params) {
        String sql = "update student " +
                "   set stuName = ？," +
                "   sex = ?" +
                "   birthday = ? " +
                "   where stuId = ?";
        BaseDao.setPst(sql,params);
        if(BaseDao.executeUpdate()>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteStu(Object[] params) {
        String sql = "delete from student where stuId = ?";
        BaseDao.setPst(sql,params);
        if(BaseDao.executeUpdate()>0){
            return true;
        }
        return false;
    }

    @Override
    public List<Map<String, Object>> queryStudent(String stuId) {
        String sql = "select stuId,stuName,sex,birthday from student where stuId = ?";
        BaseDao.setPst(sql,new Object[]{stuId});
        return BaseDao.executeQuery();
    }
}
