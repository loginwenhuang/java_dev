package com.wen.service.impl;

import com.wen.dao.IStudentDao;
import com.wen.dao.impl.StudentDaoImpl;
import com.wen.entity.Student;
import com.wen.service.IStudentService;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 15:57
 */
public class StudentServiceImpl implements IStudentService {
    IStudentDao studentDao = new StudentDaoImpl();
    @Override
    public Student haveTheStu(int userId) {
        return studentDao.selectStu(userId);
    }

    @Override
    public Boolean updateStu(Student student) {
        return studentDao.updateStu(student)>0;
    }
}
