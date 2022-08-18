package com;

import com.dao.IStudentDao;
import com.dao.impl.StudentDaoImpl;
import com.dao.impl.StudentDaoImpl1;
import org.junit.Test;

import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/13 8:35
 */
public class MyTest {
    public static void main(String[] args) throws IOException {
        IStudentDao studentDao = new StudentDaoImpl();
        System.out.println(studentDao.listAll());
    }
    @Test
    public void test1() throws IOException {
        IStudentDao studentDao = new StudentDaoImpl1();
        System.out.println(studentDao.listAll());
    }
}
