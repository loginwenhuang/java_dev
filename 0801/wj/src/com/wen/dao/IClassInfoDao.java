package com.wen.dao;

import com.wen.entity.ClassInfo;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 16:29
 */
public interface IClassInfoDao {
    /**
     * 查询全部的班级
     * @return
     */
    List<Map<String,Object>> allClass();

    /**
     * 添加班级
     * @param classInfo
     * @return
     */
    int insertClass(ClassInfo classInfo);

    /**
     * 修改班级
     * @param classInfo
     * @return
     */
    int updateClass(ClassInfo classInfo);

    /**
     * 删除班级
     * @param classId
     * @return
     */
    int deleteClass(Integer classId);

    /**
     * 清空班级表
     * @return
     */
    int cleanClass();

}
