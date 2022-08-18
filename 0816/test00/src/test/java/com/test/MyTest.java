package com.test;

import com.entity.Goods;
import com.mapper.GoodsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

/**
 * @author :muxiaowen
 * @date : 2022/8/16 8:22
 */
public class MyTest {
    @Test
    public void goodsList() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        GoodsMapper mapper = build.openSession(true).getMapper(GoodsMapper.class);
        List<Goods> goodsList = mapper.goodsList();
        for(Goods g:goodsList){
            System.out.println(g);
        }
    }
    @Test
    public void test1(){
        UUID.randomUUID().toString().substring(0, 32);
        //String salt = "18dda481-a0e4-4962-822f-ee1b222e";
        String salt = "b28182ce-5fd3-4cba-a682-5b5e079af720";
                // "3633e45f-941d-496f-adb7-255f5e2c565b";
                //"8c2920ca-b3bc-4e64-ad4e-1ab59b4f";
        String MD5 = "MD5";
        int count = 1000;
        SimpleHash simpleHash = new SimpleHash(MD5, "123456", salt, count);
        System.out.println(simpleHash.toString());
    }
}
