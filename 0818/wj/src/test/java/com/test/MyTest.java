package com.test;

import com.entity.Class;
import com.entity.Student;
import com.mapper.ClassInfoMapper;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 9:13
 */
public class MyTest {
    @Test
    public void studentList() throws ParseException {
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setName("李四");
        student.setSex("女");
        student.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("2004-2-2"));
        System.out.println("插入一条数据");
        mapper.insert(student);
        List<Student> studentList = mapper.studentList();
        System.out.println("第一次查询:"+studentList);

        StudentMapper mapper1 = session.getMapper(StudentMapper.class);
        System.out.println("第二次查询，测一级缓存:"+mapper1.studentList());

        session.commit();
        System.out.println("commit 提交数据 作为二级缓存");

        SqlSession sqlSession = factory.openSession(true);
        StudentMapper mapper2 = sqlSession.getMapper(StudentMapper.class);

        System.out.println("新的session查询，测试二级缓存"+mapper2.studentList());

        Student student1 = new Student();
        student1.setId(5);
        student1.setName("李四四");
        student1.setSex("女");
        student1.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("2004-2-2"));

        System.out.println("一次修改操作!");
        mapper.update(student1);
        System.out.println("修改后的查询:"+mapper.studentList());

        System.out.println("一个删除!");
        mapper.delete(4);
        //二级缓存
        System.out.println("删除后的查询:"+mapper.studentList());
    }
    @Test
    public void clazz(){
        ClassInfoMapper mapper = session.getMapper(ClassInfoMapper.class);
        Class c = new Class();
        c.setName("大");
        mapper.insert(c);
        c.setId(4);
        c.setName("发");
        mapper.update(c);
        mapper.delete(1);
        System.out.println(mapper.studentList());
    }
    @Test
    public void dateTest() throws ParseException {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse("2004-2-2"));
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
