package com.test;

import com.dao.IGoodsDao;
import com.dao.impl.GoodsDaoImpl;
import com.entity.Goods;
import com.entity.PageInfo;
import com.mapper.GoodsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/12 17:46
 */
public class MyTest {
    private IGoodsDao goodsDao = new GoodsDaoImpl();


    @Test
    public void test5() {
        PageInfo pageInfo = goodsDao.goodsListByPage(1, 3);
        System.out.println(pageInfo);
    }
}
