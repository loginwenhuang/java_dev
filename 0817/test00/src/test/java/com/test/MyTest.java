package com.test;

import com.entity.Student;
import com.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/17 8:31
 */
public class MyTest {
    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        StudentMapper mapper = build.openSession(true).getMapper(StudentMapper.class);

        List<Student> studentList = new ArrayList<>();
        Student student = new Student();
        student.setName("张三");
        student.setBirthday(java.sql.Date.valueOf("2022-8-17"));
        student.setPhone("1234567");

        Student student1 = new Student();
        student1.setName("李四");
        student1.setBirthday(java.sql.Date.valueOf("2022-7-17"));
        student1.setPhone("12345676");

        studentList.add(student);
        studentList.add(student1);
        mapper.insert(studentList);

        System.out.println(student.getStudentId());
        List<Student> select = mapper.select();
        for (Student s:select) {
            System.out.println(s);
        }
    }
}
