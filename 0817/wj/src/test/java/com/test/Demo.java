package com.test;

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

/**
 * @author :muxiaowen
 * @date : 2022/8/19 15:02
 */
public class Demo {

    @Test
    public void goodsList(){
        SqlSession sqlSession1 = factory.openSession(true);
        GoodsMapper mapper1 = sqlSession1.getMapper(GoodsMapper.class);
        mapper1.goodsList().forEach(System.out::println);
        //必须提交，提交表示这个查询完毕了，才会将结果存入二级缓存,关闭也会提交
        //session.commit();
        sqlSession1.close();

        System.out.println("===========");
        SqlSession sqlSession2 = factory.openSession(true);
        GoodsMapper mapper2 = sqlSession2.getMapper(GoodsMapper.class);
        mapper2.goodsList().forEach(System.out::println);
        sqlSession2.close();

    }
    private static SqlSessionFactory factory;
    private SqlSession session;
    @BeforeClass
    public static void setFactory() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
}
