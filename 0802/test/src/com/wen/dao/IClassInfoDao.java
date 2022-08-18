package com.wen.dao;

import com.wen.entity.ClassInfo;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/2 8:25
 */
public interface IClassInfoDao {
    List<ClassInfo> selectAllClassInfo();
    int insertClassInfo(ClassInfo classInfo);
    int updateClassInfo(ClassInfo classInfo);
    int deleteClassInfo(Integer classId);
    ClassInfo selectClassInfo(Integer classId);
}
