package com.wen.service;

import com.wen.entity.Student;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 9:12
 */
public interface IStudentService {
    /**
     * 查询全部学生
     * @return
     */
    List<Student> allStudents();

    /**
     * 添加学生
     * @param student
     * @return
     */
    boolean addStudent(Student student);

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    boolean modifyStudent(Student student);

    /**
     * 删除学生
     * @param stuId
     * @return
     */
    boolean removeStudent(Integer stuId);

    /**
     * 清空所有学生
     * @return
     */
    int clearStudent();
}
