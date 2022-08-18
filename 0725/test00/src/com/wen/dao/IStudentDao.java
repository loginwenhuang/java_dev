package com.wen.dao;

import com.wen.enity.Student;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 14:13
 */
public interface IStudentDao {
    Integer insertStu(Student student);
    Integer deleteStu(Integer stuId);
    Integer updateStu(Student student);
    List<Student> selectAllStu();
    Student selectStu(Integer stuId);

}
