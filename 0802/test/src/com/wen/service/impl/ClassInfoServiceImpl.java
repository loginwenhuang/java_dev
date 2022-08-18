package com.wen.service.impl;

import com.wen.dao.IClassInfoDao;
import com.wen.dao.impl.ClassInfoDaoImpl;
import com.wen.entity.ClassInfo;
import com.wen.service.IClassInfoService;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/2 8:38
 */
public class ClassInfoServiceImpl implements IClassInfoService {
    IClassInfoDao classInfoDao = new ClassInfoDaoImpl();
    @Override
    public List<ClassInfo> classInfos() {
        return classInfoDao.selectAllClassInfo();
    }

    @Override
    public boolean insertClassInfo(ClassInfo classInfo) {
        return classInfoDao.insertClassInfo(classInfo)>0;
    }

    @Override
    public boolean updateClassInfo(ClassInfo classInfo) {
        return classInfoDao.updateClassInfo(classInfo)>0;
    }

    @Override
    public boolean deleteClassInfo(Integer classId) {
        return classInfoDao.deleteClassInfo(classId)>0;
    }
}
