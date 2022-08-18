package com.wen.service;

import com.wen.entity.ClassInfo;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/2 8:36
 */
public interface IClassInfoService {
    List<ClassInfo> classInfos();
    boolean insertClassInfo(ClassInfo classInfo);
    boolean updateClassInfo(ClassInfo classInfo);
    boolean deleteClassInfo(Integer classId);
}
