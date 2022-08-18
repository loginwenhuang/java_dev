package com.wen.dao;

import com.wen.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 9:06
 */
public interface IStudentDao {
    /**
     * 查找全部学生
     * @return
     */
    List<Map<String,Object>> selectStudents();

    /**
     * 插入学生数据
     * @param student
     * @return
     */
    int insertStudent(Student student);

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    int updateStudent(Student student);

    /**
     * 删除单个学生
     * @param stuId 学号
     * @return
     */
    int deleteStudent(Integer stuId);

    /**
     * 删除所有学生
     * @return
     */
    int cleanStudents();
}
