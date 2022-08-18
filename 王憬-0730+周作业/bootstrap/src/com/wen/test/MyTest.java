package com.wen.test;

import com.wen.dao.ILoginAndRegisterDao;
import com.wen.dao.IStudentDao;
import com.wen.dao.impl.LoginAndRegisterDao;
import com.wen.entity.Student;
import com.wen.entity.User;
import com.wen.service.IStudentService;
import com.wen.service.impl.StudentServiceImpl;

/**
 * @author :muxiaowen
 * @date : 2022/7/27 17:22
 */
public class MyTest {
    public static void main(String[] args) {
        Student student = null;
        IStudentService studentService = new StudentServiceImpl();
        student = studentService.haveTheStu(15);
        System.out.println(student==null);

    }
}
