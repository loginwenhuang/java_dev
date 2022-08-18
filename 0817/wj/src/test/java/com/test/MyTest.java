package com.test;

import com.entity.Category;
import com.entity.Goods;
import com.mapper.CategoryMapper;
import com.mapper.GoodsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/17 9:17
 */
public class MyTest {
    private static SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    @BeforeClass
    public static void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
        sqlSessionFactory= new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
    @Before
    public void test2(){
       session = sqlSessionFactory.openSession(true);
    }

    @Test
    public void goodsList(){
        GoodsMapper mapper = session.getMapper(GoodsMapper.class);
        for (Goods g: mapper.goodsList()) {
            System.out.println(g);
        }
        for (Goods g: mapper.selectByName("茶")) {
            System.out.println(g);
        }

        for (Goods g: mapper.selectByPrice(5.5,10.0)) {
            System.out.println(g);
        }
    }
    @Test
    public void categoryList(){
        CategoryMapper mapper = session.getMapper(CategoryMapper.class);
        for (Category c: mapper.categoryList()) {
            System.out.println(c);
        }
    }

    @Test
    public void goodsList2(){
        GoodsMapper mapper = session.getMapper(GoodsMapper.class);
        List<Goods> goodsList = mapper.goodsList2();
        System.out.println("品名:"+goodsList.get(0).getGoodsName());
        System.out.println("分类:"+goodsList.get(0).getCategory().getCategoryName());
        //清理缓存
        session.close();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        System.out.println("==========");
        GoodsMapper mapper1 = sqlSession.getMapper(GoodsMapper.class);
        List<Goods> goodsList1 = mapper1.goodsList2();
        System.out.println("品名:"+goodsList1.get(2).getGoodsName());
        System.out.println("==========");
        GoodsMapper mapper2 = sqlSession.getMapper(GoodsMapper.class);
        mapper2.goodsList2();
        mapper2.goodsList2();
    }

    @After
    public void close(){
        session.close();
    }

}
