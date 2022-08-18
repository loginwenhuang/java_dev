package com.wen.dao.Impl;

import com.wen.dao.IStudentDao;
import com.wen.enity.Student;
import com.wen.util.BaseDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 14:20
 */
public class StudentDaoImpl implements IStudentDao {
    Object[] params = null;
    @Override
    public Integer insertStu(Student student) {
        String sql = "insert into student(stuName,sex,birthday)" +
                "   values (?,?,?)";
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
        String sql = "delete from student " +
                "   where stuId = ?";
        BaseDao.setPst(sql,new Object[]{stuId});
        return BaseDao.executeUpdate();
    }

    @Override
    public Integer updateStu(Student student) {
        String sql = "update student " +
                "   set stuName = ?," +
                "   sex =?," +
                "   birthday = ?" +
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
    public List<Student> selectAllStu() {
        String sql = "select * from student";
        BaseDao.setPst(sql,null);
        List<Map<String,Object>> rows = BaseDao.executeQuery();
        List<Student> students = new ArrayList<>();
        for (Map map: rows) {
            Student student = new Student(
                    (Integer) map.get("stuId"),
                    (String)map.get("stuName"),
                    (String)map.get("sex"),
                    (Date) map.get("birthday")
            );
            students.add(student);
        }
        return students;
    }

    @Override
    public Student selectStu(Integer stuId) {
        String sql = "select * from student " +
                "   where stuId = ?";
        BaseDao.setPst(sql,new Object[]{stuId});
        Map map = BaseDao.executeQuery().get(0);
        Student student = new Student(
                (Integer) map.get("stuId"),
                (String)map.get("stuName"),
                (String)map.get("sex"),
                (Date) map.get("birthday")
        );
        return student;
    }
}
