package com.dao.impl;

import com.dao.IStudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/13 8:29
 */
public class StudentDaoImpl implements IStudentDao {
    @Override
    public List<Map> listAll() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);

        return sqlSession.selectList("com.mapper.StudentMapper.selectStudents");
    }
}
