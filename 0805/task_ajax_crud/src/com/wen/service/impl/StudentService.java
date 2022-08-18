package com.wen.service.impl;

import com.wen.dao.IStudentDao;
import com.wen.dao.impl.StudentDaoImpl;
import com.wen.entity.PageData;
import com.wen.entity.Student;
import com.wen.service.IStudentService;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/5 16:55
 */
public class StudentService implements IStudentService {
    IStudentDao studentDao = new StudentDaoImpl();
    @Override
    public List<Map<String, Object>> allStudent() {
        return studentDao.allStudent();
    }

    @Override
    public int insertStu(Student student) {
        return studentDao.insertStu(student);
    }

    @Override
    public int deleteStu(Integer stuId) {
        return studentDao.deleteStu(stuId);
    }

    @Override
    public int updateStu(Student student) {
        return studentDao.updateStu(student);
    }

    @Override
    public Student selectByStuId(Integer stuId) {
        return studentDao.selectByStuId(stuId);
    }

    @Override
    public PageData queryByPage(Integer pageNo, Integer pageSize) {
        return studentDao.queryByPage(pageNo,pageSize);
    }

    @Override
    public List<Map<String, Object>> querySOmeStu(String search) {
        return studentDao.searchSomeStu(search);
    }
}
