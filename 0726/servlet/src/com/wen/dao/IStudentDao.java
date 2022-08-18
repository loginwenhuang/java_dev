package com.wen.dao;

import com.wen.enity.Student;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 16:10
 */
public interface IStudentDao {
    Integer insertStu(Student student);
    Integer deleteStu(Integer stuId);
    Integer updateStu(Student student);
    Student selectStu(Integer stuId);
    List<Student> selectAllStu();
}
