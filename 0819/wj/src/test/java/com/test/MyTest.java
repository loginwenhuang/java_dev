package com.test;

import com.entity.Goods;
import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.GoodsMapper;
import com.mapper.IGoodsDaoCo;
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

public class MyTest {
    @Test
    public void testSelectByExample(){
        Example example = new Example(Goods.class);

        example.createCriteria().andBetween("goodsId",15,19);
        example.or(example.createCriteria().andLike("goodsName","%茶%"));
        example.setOrderByClause("goodsId desc");

        IGoodsDaoCo mapper = session.getMapper(IGoodsDaoCo.class);
        mapper.selectByExample(example).forEach(System.out::println);
    }
    @Test
    public void IGoodsDaoCo(){
        IGoodsDaoCo mapper = session.getMapper(IGoodsDaoCo.class);
        List<Goods> select = mapper.select(null);
        System.out.println(select);
        Goods goods = mapper.selectByPrimaryKey(19);
        System.out.println(goods);
        session.close();
    }
    @Test
    public void pageHelper(){
        PageHelper.startPage(1,3);
        GoodsMapper mapper = session.getMapper(GoodsMapper.class);
        System.out.println(new PageInfo<>(mapper.goodsList()));

/*        PageHelper.startPage(3,3);
        GoodsMapper mapper1 = session.getMapper(GoodsMapper.class);
        System.out.println(new PageInfo<>(mapper1.goodsList()));*/
        session.close();
    }

    private static SqlSessionFactory factory;
    private SqlSession session;

    @BeforeClass
    public static void setFactory() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }

    @Before
    public void setSession() {
        session = factory.openSession(true);
    }
}