package com.test;

import com.entity.Goods;
import com.mapper.GoodsMapper;
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
 * @date : 2022/8/18 8:26
 */
public class MyTest {

    @Test
    public void goodsList(){
        GoodsMapper mapper = session.getMapper(GoodsMapper.class);
        List<Goods> goodsList = mapper.goodsList();
        System.out.println(goodsList.get(0));
        session.commit();

        SqlSession sqlSession = factory.openSession(true);
        GoodsMapper mapper1 = sqlSession.getMapper(GoodsMapper.class);
        List<Goods> goodsList1 = mapper1.goodsList();
        System.out.println(goodsList1.get(2));
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
