package com.wen.app;

import com.wen.service.IClassService;
import com.wen.service.IStudentService;
import com.wen.service.impl.ClassServiceImpl;
import com.wen.service.impl.StudentService;

/**
 * @author :muxiaowen
 * @date : 2022/8/6 16:09
 */
public class MyTest {

    public static void main(String[] args) {
        IStudentService studentService = new StudentService();
        IClassService classService = new ClassServiceImpl();
        //System.out.println(studentService.allStudent());
        //System.out.println(classService.classList());
        System.out.println(studentService.querySOmeStu("张"));
    }
}
