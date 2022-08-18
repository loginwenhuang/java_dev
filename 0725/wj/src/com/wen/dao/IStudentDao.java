package com.wen.dao;

import com.wen.enity.Student;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 9:06
 */
public interface IStudentDao {
    boolean insertStu(Object[] params);

    boolean updateStu(Object[] params);

    boolean deleteStu(Object[] params);

    List<Map<String,Object>> queryStudent(String stuId);
}
