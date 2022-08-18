package com.dao.impl;

import com.dao.IGoodsDao;
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
 * @date : 2022/8/13 9:05
 */
public class GoodsDaoImpl implements IGoodsDao {
    @Override
    public List<Map> goodsList() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        sqlSession.close();
        return sqlSession.selectList("com.mapper.Goods.goodsList");
    }
}
