package com.wen.service.impl;

import com.sun.org.glassfish.gmbal.IncludeSubclass;
import com.wen.dao.IStudentDao;
import com.wen.dao.impl.StudentDaoImpl;
import com.wen.entity.Student;
import com.wen.service.IStudentService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 9:12
 */
public class StudentServiceImpl implements IStudentService {
    IStudentDao studentDao = new StudentDaoImpl();
    List<Map<String,Object>> allStudent = null;
    @Override
    public List<Student> allStudents() {
        allStudent = studentDao.selectStudents();
        List<Student> students = new ArrayList<>();
        if (allStudent.size() > 0) {
            for (Map map : allStudent) {
                Student student = new Student(
                        (Integer) map.get("stuId"),
                        (String) map.get("stuName"),
                        (String) map.get("sex"),
                        (Date) map.get("birthday"),
                        new BigDecimal(map.get("tall").toString()).doubleValue(),
                        (Integer) map.get("classId")
                );
                students.add(student);
            }
        }
        return students;
    }

    @Override
    public boolean addStudent(Student student) {
        return studentDao.insertStudent(student)>0;
    }

    @Override
    public boolean modifyStudent(Student student) {
        return studentDao.updateStudent(student)>0;
    }

    @Override
    public boolean removeStudent(Integer stuId) {
        return studentDao.deleteStudent(stuId)>0;
    }

    @Override
    public int clearStudent() {
        return studentDao.cleanStudents();
    }
}
