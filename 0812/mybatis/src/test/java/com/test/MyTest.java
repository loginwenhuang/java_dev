package com.test;

import com.dao.IStudentDao;
import com.dao.impl.StudentDaoImpl;
import org.junit.*;

import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/12 16:20
 */
public class MyTest {
    private IStudentDao studentDao = new StudentDaoImpl();

    @Test
    public void test1() throws IOException {
        System.out.println(studentDao.listAll());
    }
    @BeforeClass
    public static void test2(){
        System.out.println("你好");
    }
    @Before
    public void test3(){
        System.out.println("这是before,在每个测试方法前执行");
    }
}
