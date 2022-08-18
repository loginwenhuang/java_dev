package com.wen.dao.impl;

import com.wen.dao.IStudentDao;
import com.wen.entity.Student;
import com.wen.util.BaseDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 16:14
 */
public class StudentDaoImpl implements IStudentDao {
    Object[] params = null;
    Student student = null;
    @Override
    public Integer insertStu(Student student) {
        String sql = "insert into student " +
                "   (stuName,sex,birthday)" +
                "   value" +
                "   (?,?,?)";
        params = new Object[]{
                student.getStuName(),
                student.getSex(),
                student.getBirthday()
        };
        BaseDao.setPst(sql,params);
        return BaseDao.executeUpdate();
    }

    @Override
    public Integer deleteStu(Integer stuId) {
        String sql = "delete from student where stuId = ?";
        BaseDao.setPst(sql,new Object[]{stuId});
        return BaseDao.executeUpdate();
    }

    @Override
    public Integer updateStu(Student student) {
        String sql = "update student" +
                "   set stuName = ? ," +
                "   sex = ? ," +
                "   birthday = ? " +
                "   where stuId = ?";
        params = new Object[]{
                student.getStuName(),
                student.getSex(),
                student.getBirthday(),
                student.getStuId()
        };
        BaseDao.setPst(sql,params);
        return BaseDao.executeUpdate();
    }

    @Override
    public Student selectStu(Integer userId) {
        String sql = "select stuId,stuName,sex,birthday " +
                "   from student " +
                "   where userId = ?";
        BaseDao.setPst(sql,new Object[]{userId});
        Map map = BaseDao.executeQuery().get(0);
        student = new Student(
                (Integer) map.get("stuId"),
                (String) map.get("stuName"),
                (String) map.get("sex"),
                (Date) map.get("birthday")
                );
        return student;
    }

    @Override
    public List<Student> selectAllStu() {
        String sql = "select stuId,stuName,sex,birthday " +
                "   from student ";
        List<Student> students = new ArrayList<>();
        BaseDao.setPst(sql,null);
        for (Map map: BaseDao.executeQuery()) {
            student = new Student(
                    (Integer) map.get("stuId"),
                    (String) map.get("stuName"),
                    (String) map.get("sex"),
                    (Date) map.get("birthday")
            );
            students.add(student);
        }
        return students;
    }
}
