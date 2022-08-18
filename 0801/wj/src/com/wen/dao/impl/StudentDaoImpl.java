package com.wen.dao.impl;

import com.wen.dao.IStudentDao;
import com.wen.entity.Student;
import com.wen.util.BaseDao;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 9:06
 */
public class StudentDaoImpl implements IStudentDao {
    Object[] params = null;
    @Override
    public List<Map<String,Object>> selectStudents() {
        String sql = "select stuId,stuName,sex,birthday,tall,student.classId " +
                "   from student,classInfo" +
                "    where student.classId=classInfo.classId";
        BaseDao.setPst(sql,null);
        return BaseDao.executeQuery();
    }

    @Override
    public int insertStudent(Student student) {
        String sql = "insert into student(stuName,sex,birthday,tall,classId)" +
                "   value" +
                "   (?,?,?,?,?)";
        params = new Object[]{
                student.getStuName(),
                student.getSex(),
                student.getBirthday(),
                student.getTall(),
                student.getClassId()
        };
        BaseDao.setPst(sql,params);
        return BaseDao.executeUpdate();
    }

    @Override
    public int updateStudent(Student student) {
        String sql = "update student" +
                "   set stuName = ?," +
                "       sex = ?," +
                "       birthday = ?," +
                "       tall = ? ," +
                "       classId = ?" +
                "   where stuId = ?";
        params = new Object[]{
                student.getStuName(),
                student.getSex(),
                student.getBirthday(),
                student.getTall(),
                student.getClassId(),
                student.getStuId()
        };
        BaseDao.setPst(sql,params);
        return BaseDao.executeUpdate();
    }

    @Override
    public int deleteStudent(Integer stuId) {
        String sql = "delete from student where stuId = ?";
        BaseDao.setPst(sql,new Object[]{stuId});
        return BaseDao.executeUpdate();
    }

    @Override
    public int cleanStudents() {
        String sql = "truncate student";
        BaseDao.setPst(sql,null);
        return BaseDao.executeUpdate();
    }
}
