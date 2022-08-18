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
 * @date : 2022/8/12 16:14
 */
public class StudentDaoImpl implements IStudentDao {
    @Override
    public List<Map> listAll() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        List stuList = sqlSession.selectList("com.mapper.StudentInfoMapper.listAll");
        return stuList;
    }
}
