package com.test;

import com.entity.ClassInfo;
import com.entity.StudentInfo;
import com.mapper.ClassMapper;
import com.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/16 9:12
 */
public class MyTest {
    @Test
    public void studentList() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        StudentMapper mapper = build.openSession(true).getMapper(StudentMapper.class);
        List<StudentInfo> studentInfos = mapper.studentList();
        for(StudentInfo s:studentInfos){
            System.out.println(s);
        }
    }
    @Test
    public void classList() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        ClassMapper mapper = build.openSession(true).getMapper(ClassMapper.class);
        List<ClassInfo> classList = mapper.classList();
        for(ClassInfo c:classList){
            System.out.println(c);
        }
    }
    @Test
    public void studentList1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        StudentMapper mapper = build.openSession(true).getMapper(StudentMapper.class);
        List<StudentInfo> studentInfos = mapper.studentList1(1,null);
        for(StudentInfo s:studentInfos){
            System.out.println(s);
        }
    }

    @Test
    public void studentList2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        StudentMapper mapper = build.openSession(true).getMapper(StudentMapper.class);
        List<StudentInfo> studentInfos = mapper.studentList2(2,null);
        for(StudentInfo s:studentInfos){
            System.out.println(s);
        }
    }
}
