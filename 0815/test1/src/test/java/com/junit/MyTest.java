package com.junit;

import com.entity.Category;
import com.entity.Goods;
import com.mapper.CategoryMapper;
import com.mapper.GoodsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/15 15:18
 */
public class MyTest {
    private static SqlSessionFactory factory;
    private SqlSession session;
    @BeforeClass
    public static void buildFactory() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
    @Before
    public void sqlSession(){
        session = factory.openSession(true);
    }

    @Test
    public void selectGoods(){
        GoodsMapper mapper = session.getMapper(GoodsMapper.class);
        List<Goods> goodsList = mapper.goodsList(1,3);
        for (Goods g: goodsList) {
            System.out.println(g);
        }
    }

    @Test
    public void selectCategory(){
        CategoryMapper mapper = session.getMapper(CategoryMapper.class);
        for (Category c: mapper.categoryList()) {
            System.out.println(c);
        }
    }

    @After
    public void close(){
        session.commit();
        session.close();
    }
}
