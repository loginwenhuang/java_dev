package com.wen.dao.impl;

import com.wen.dao.IClassInfoDao;
import com.wen.entity.ClassInfo;
import com.wen.util.BaseDao;

import java.util.Base64;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/2 8:29
 */
public class ClassInfoDaoImpl implements IClassInfoDao {
    List<ClassInfo> classInfoList = null;
    @Override
    public List<ClassInfo> selectAllClassInfo() {
        String sql = "select classId,className from classInfo ";
        BaseDao.setPst(sql,null);
        List<Map<String,Object>> rows = BaseDao.executeQuery();
        if(rows.size()>0){
            for (Map map:rows) {
                ClassInfo classInfo = new ClassInfo(
                        (Integer) map.get("classId"),
                        (String)map.get("className")
                );
                classInfoList.add(classInfo);
            }
        }
        return classInfoList;
    }

    @Override
    public int insertClassInfo(ClassInfo classInfo) {
        String sql = "insert into classInfo(className)" +
                "   value" +
                "   (?)";
        BaseDao.setPst(sql,new Object[]{
                classInfo.getClassName()
        });
        return BaseDao.executeUpdate();
    }

    @Override
    public int updateClassInfo(ClassInfo classInfo) {
        String sql = "update classInfo" +
                "   set className = ?" +
                "   where classId = ?";
        BaseDao.setPst(sql,new Object[]{
                classInfo.getClassName(),
                classInfo.getClassId()
        });
        return 0;
    }

    @Override
    public int deleteClassInfo(Integer classId) {
        String sql = "delete from classInfo where classId = ?";
        BaseDao.setPst(sql,new Object[]{classId});
        return BaseDao.executeUpdate();
    }

    @Override
    public ClassInfo selectClassInfo(Integer classId) {
        String sql = "select classId,className from classInfo where classId = ?";
        BaseDao.setPst(sql,new Object[]{classId});
        List<Map<String,Object>> rows = BaseDao.executeQuery();
        if(rows.size()>0){
            Map map = rows.get(0);
            ClassInfo classInfo = new ClassInfo(
                    (Integer) map.get("classId"),
                    (String)map.get("className")
            );
            return classInfo;
        }
        return null;
    }
}
