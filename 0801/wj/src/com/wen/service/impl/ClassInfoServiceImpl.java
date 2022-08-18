package com.wen.service.impl;

import com.wen.dao.IClassInfoDao;
import com.wen.dao.impl.ClassInfoDaoImpl;
import com.wen.entity.ClassInfo;
import com.wen.service.IClassInfoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 16:51
 */
public class ClassInfoServiceImpl implements IClassInfoService {
    IClassInfoDao classInfoDao = new ClassInfoDaoImpl();
    @Override
    public List<ClassInfo> allClass() {
        List<Map<String,Object>> rows = classInfoDao.allClass();
        List<ClassInfo> classInfoList = new ArrayList<>();
        if(rows.size()>0){
            for (Map map: rows) {
                classInfoList.add(new ClassInfo(
                        (Integer) map.get("classId"),
                        (String) map.get("className")
                ));
            }
        }

        return classInfoList;
    }

    @Override
    public boolean insertClass(ClassInfo classInfo) {
        return classInfoDao.insertClass(classInfo)>0;
    }

    @Override
    public boolean modifyClass(ClassInfo classInfo) {
        return classInfoDao.updateClass(classInfo)>0;
    }

    @Override
    public boolean deleteClass(Integer classId) {
        return classInfoDao.deleteClass(classId)>0;
    }

    @Override
    public int cleanClass() {
        return classInfoDao.cleanClass();
    }
}
