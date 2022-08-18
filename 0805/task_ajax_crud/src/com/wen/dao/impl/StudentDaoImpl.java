package com.wen.dao.impl;

import com.mysql.cj.util.StringUtils;
import com.wen.dao.IStudentDao;
import com.wen.entity.PageData;
import com.wen.entity.Student;
import com.wen.util.BaseDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/5 16:34
 */
public class StudentDaoImpl implements IStudentDao {
    @Override
    public List<Map<String, Object>> allStudent() {
        String sql = "select studentId,name,sex,birthday,province,studentInfo.classId,className" +
                "   from studentInfo join classInfo " +
                "   on studentInfo.classId = classInfo.classId";
        return BaseDao.executeQuery(sql,null);
    }

    @Override
    public int insertStu(Student student) {
        String sql = "select max(studentId) from studentInfo";
        Integer studentId = (Integer) BaseDao.executeQuery(sql,null).get(0).get("max(studentId)");
        sql = "insert into studentInfo(studentId,name,sex,birthday,province,classId)" +
                "   value (?,?,?,?,?,?)";
        System.out.println("未预处理的aql:"+sql);
        return BaseDao.executeUpdate(sql,new Object[]{
                studentId+1,
                student.getName(),
                student.getSex(),
                student.getBirthday(),
                student.getProvince(),
                student.getClassId()
        });
    }

    @Override
    public int deleteStu(Integer stuId) {
        String sql="delete from studentInfo where studentId = ?";
        return BaseDao.executeUpdate(sql,new Object[]{stuId});
    }

    @Override
    public int updateStu(Student student) {
        String sql = "update studentInfo " +
                "   set name = ?," +
                "       sex = ?, " +
                "       birthday = ?," +
                "       province = ?," +
                "       classId = ?" +
                "   where studentId = ?";
        return BaseDao.executeUpdate(sql,new Object[]{
                student.getName(),
                student.getSex(),
                student.getBirthday(),
                student.getProvince(),
                student.getClassId(),
                student.getStudnetId()
        });
    }

    @Override
    public Student selectByStuId(Integer stuId) {
        String sql = "select studentId,name,sex,birthday,province,classId" +
                "   from studentInfo join classInfo " +
                "   on studentInfo.classId = classInfo.classId  " +
                "   where studentId = ?";
        List<Map<String,Object>> rows = BaseDao.executeQuery(sql,new Object[]{stuId});
        Student student = new Student();
        if(rows.size()>0){
            Map map = rows.get(0);
            student.setStudnetId((Integer) map.get("stuId"));
            student.setName((String) map.get("name"));
            student.setSex((String) map.get("sex"));
            student.setBirthday((Date)map.get("birthday"));
            student.setProvince((String) map.get("phone"));
            student.setClassId((Integer)map.get("classId"));
        }
        return student;
    }

    @Override
    public PageData queryByPage(Integer pageNo, Integer pageSize) {
        PageData pageData = new PageData();
        pageData.setPageNo(pageNo);
        pageData.setPageSize(pageSize);
        String sql = "select count(studentId) from studentInfo";
        pageData.setTotalCount(BaseDao.getTotal(sql,null));
        pageData.setTotalPage();
        sql = "select studentId,name,sex,birthday,province,studentInfo.classId,className" +
                "   from studentInfo join classInfo " +
                "   on studentInfo.classId = classInfo.classId  " +
                "   order by studentId  " +
                "   limit ?,?";
        pageData.setData(BaseDao.executeQuery(sql,new Object[]{(pageNo-1)*pageSize,pageSize}));
        return pageData;
    }

    @Override
    public List<Map<String, Object>> searchSomeStu(String search) {
        if(StringUtils.isNullOrEmpty(search)){
            return allStudent();
        }
        StringBuilder searchSql = new StringBuilder();
        searchSql.append(" and name like ?");
        String sql = "select studentId,name,sex,birthday,province,studentInfo.classId,className" +
                "   from studentInfo join classInfo" +
                "   on studentInfo.classId = classInfo.classId" +
                "   where 1=1 "+searchSql;
        System.out.println(sql);
        return BaseDao.executeQuery(sql,new Object[]{"%"+search+"%"});
    }
}
