package com.wen.dao.impl;

import com.wen.dao.IClassInfoDao;
import com.wen.entity.ClassInfo;
import com.wen.util.BaseDao;

import javax.jws.Oneway;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 16:39
 */
public class ClassInfoDaoImpl implements IClassInfoDao {
    @Override
    public List<Map<String,Object>> allClass() {
        String sql = "select classId,className from classInfo order by classId";
        BaseDao.setPst(sql,null);
        return BaseDao.executeQuery();
    }

    @Override
    public int insertClass(ClassInfo classInfo) {
        String sql = "insert into classInfo(className)" +
                "   value" +
                "   (?)";
        BaseDao.setPst(sql,new Object[]{classInfo.getClassName()});
        return BaseDao.executeUpdate();
    }

    @Override
    public int updateClass(ClassInfo classInfo) {
        String sql = "update classInfo set className = ? where classId = ? ";
        BaseDao.setPst(sql,new Object[]{
                classInfo.getClassName(),
                classInfo.getClassId()
        });
        return BaseDao.executeUpdate();
    }

    @Override
    public int deleteClass(Integer classId) {
        String sql = "delete from classInfo where classId = ?";
        BaseDao.setPst(sql,new Object[]{classId});
        return BaseDao.executeUpdate();
    }

    @Override
    public int cleanClass() {
        String sql = "truncate classInfo";
        BaseDao.setPst(sql,null);
        return BaseDao.executeUpdate();
    }
}
