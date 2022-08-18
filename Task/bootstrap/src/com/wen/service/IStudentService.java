package com.wen.service;

import com.wen.entity.Student;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 15:54
 */
public interface IStudentService {
    /**
     * 用户的个人信息
     * @param userId
     * @return
     */
    Student haveTheStu(int userId);

    /**
     * 修改用户信息
     * @param student
     * @return
     */
    Boolean updateStu(Student student);
}
