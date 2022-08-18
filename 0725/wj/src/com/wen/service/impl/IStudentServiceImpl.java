package com.wen.service.impl;

import com.wen.dao.IStudentDao;
import com.wen.dao.impl.IStudentDaoImpl;
import com.wen.enity.Student;
import com.wen.service.IStudentService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 9:04
 */
public class IStudentServiceImpl implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    Object[] params = null;
    IStudentDao iStudentDao = new IStudentDaoImpl();
    Student student = null;
    @Override
    public boolean insertStu() throws ParseException {
        System.out.println("添加学生信息:");
        String[] list = new String[]{"姓名", "性别", "生日"};
        params = new Object[3];
        for (int i = 0; i < list.length; i++) {
            System.out.println("请输入学生的"+list[i]+":");
            params[i] = scanner.next();
        }
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        student = new Student(null,(String)params[0],(String)params[1],sdf.parse((String) params[2]));
        return iStudentDao.insertStu(params);
    }


    @Override
    public boolean queryStu() {
        System.out.println("请输入查询学生的学号:");
        String stuId = scanner.next();
        List<Map<String,Object>> rows =iStudentDao.queryStudent(stuId);
        if(rows.size()>0){
            Map map = rows.get(0);
            student = new Student();
            student.setStuId((Integer)map.get("stuId"));
            student.setStuName((String)map.get("stuName"));
            student.setSex((String)map.get("sex"));
            student.setBirthday((Date)map.get("birthday"));
        }
        if(student!=null){
            System.out.println(student);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateStu() {
        System.out.println("请输入学生学号:");

        return false;
    }

    @Override
    public boolean deleteStu() {
        return false;
    }
}
