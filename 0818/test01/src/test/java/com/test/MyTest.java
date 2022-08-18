package com.test;

import com.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 14:53
 */
public class MyTest {
    @Test
    public void studentList(){
        SqlSession sqlSession = factory.openSession(true);
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        mapper.studentList().forEach(System.out::println);

        StudentMapper mapper2 = sqlSession.getMapper(StudentMapper.class);
        mapper2.studentList().forEach(System.out::println);

        sqlSession.commit();
        System.out.println("二级缓存");

        SqlSession sqlSession1 = factory.openSession(true);
        StudentMapper mapper1 = sqlSession1.getMapper(StudentMapper.class);
        mapper1.studentList().forEach(System.out::println);
    }


    private static SqlSessionFactory factory;
    @BeforeClass
    public static void setFactory() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
}
