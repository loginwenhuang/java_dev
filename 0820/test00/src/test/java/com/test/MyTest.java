package com.test;

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

/**
 * @author :muxiaowen
 * @date : 2022/8/20 8:29
 */
public class MyTest {
    @Test
    public void IGoodsDaoCo(){
        IGoodsDaoCo mapper = session.getMapper(IGoodsDaoCo.class);
        mapper.select(null).forEach(System.out::println);
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
