package com.wen.service;

import com.wen.entity.ClassInfo;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 16:49
 */
public interface IClassInfoService {
    /**
     * 全部的班级信息
     * @return
     */
    List<ClassInfo> allClass();

    /**
     * 添加班级
     * @param classInfo
     * @return
     */
    boolean insertClass(ClassInfo classInfo);

    /**
     * 修改班级
     * @param classInfo
     * @return
     */
    boolean modifyClass(ClassInfo classInfo);

    /**
     * 删除班级
     * @param classId
     * @return
     */
    boolean deleteClass(Integer classId);

    /**
     * 删除所有班级，重置自增
     * @return
     */
    int cleanClass();

}
