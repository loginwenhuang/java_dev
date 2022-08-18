package com.wen.util;

import com.wen.entity.Student;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 15:08
 */
public class PackageStudentDao {

    public static Student packageStudent(HttpServletRequest request){
        Integer stuId = null;
        String stuName;
        String sex;
        Date birthday = null;
        Double tall = null;
        Integer classId = null;
        try {
            stuId = Integer.valueOf(request.getParameter("stuId"));
        }catch (Exception e){
            e.printStackTrace();
        }
        stuName = request.getParameter("stuName");
        sex = request.getParameter("sex");
        try {
            birthday = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("birthday"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try{
            tall = Double.valueOf(request.getParameter("tall"));
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            classId = Integer.valueOf(request.getParameter("classId"));
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Student(stuId,stuName,sex,birthday,tall,classId);
    }
}
