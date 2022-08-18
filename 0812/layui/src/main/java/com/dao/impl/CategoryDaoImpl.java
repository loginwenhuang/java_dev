package com.dao.impl;

import com.dao.ICategoryDao;
import com.entity.Category;
import com.mapper.CategoryMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/17 19:15
 */
public class CategoryDaoImpl implements ICategoryDao {
    private static SqlSessionFactory sessionFactory;
    static{
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Category> categoryList() {
        SqlSession sqlSession = sessionFactory.openSession(true);
        CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);
        List<Category> categoryList = mapper.categoryList();
        sqlSession.close();
        return categoryList;
    }
}
