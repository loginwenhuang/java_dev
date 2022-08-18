package com.test;

import com.entity.Student;
import com.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


/**
 * @author :muxiaowen
 * @date : 2022/8/15 8:31
 */
public class MyTest {
    private static SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    @Test
    public void select() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatis.xml");
        sqlSessionFactory  = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession =  sqlSessionFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (Student s:mapper.studentList()) {
            System.out.println(s);
        }
    }

    @After
    public void closeSqlSession(){
        sqlSession.close();
    }
}
