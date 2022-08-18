package com.test;

import com.entity.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 16:08
 */
public class MyTest {
    @Test
    public void interceptor(){
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        mapper.studentList().forEach(System.out::println);
    }
    @Test
    public void studentList_MyInterceptor(){
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        mapper.studentList().forEach(System.out::println);
    }

    @Test
    public void studentList(){
        PageHelper.startPage(2,4);
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        PageInfo<Student> pi = new PageInfo<>(mapper.studentList());
        System.out.println(pi);
    }

    private static SqlSessionFactory factory;
    private SqlSession session;
    @BeforeClass
    public static void setFactory() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
    @Before
    public void setSession(){
        session = factory.openSession(true);
    }
}
