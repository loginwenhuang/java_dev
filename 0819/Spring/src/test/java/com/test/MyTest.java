package com.test;

import com.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/19 19:43
 */
public class MyTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
        Class<? extends Student> aClass = new Student().getClass();
        Student student = aClass.newInstance();
        //Student student = ac.getBean(aClass);
        student.setName("张三");
        student.setSex("男");
        student.setId(123);
        student.setPhone("10086123");

        System.out.println(student);
    }
}
