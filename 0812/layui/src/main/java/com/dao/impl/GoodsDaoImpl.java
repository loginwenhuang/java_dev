package com.dao.impl;

import com.dao.IGoodsDao;
import com.entity.Goods;
import com.entity.PageInfo;
import com.mapper.GoodsMapper;
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
 * @date : 2022/8/12 17:40
 */
public class GoodsDaoImpl implements IGoodsDao {
    /**
     * 创建一个SqlSession的工厂用于创建sqlSession对象
     */
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
    public PageInfo goodsListByPage(int page, int limit) {
        SqlSession sqlSession = sessionFactory.openSession(true);
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        PageInfo pageInfo = new PageInfo();
        pageInfo.setPage((page-1)*limit);
        pageInfo.setLimit(limit);
        pageInfo.setTotalCount(mapper.getTotalCount());
        pageInfo.setTotalPage();

        List<Goods> goodsList = mapper.goodsListByPage((page-1)*limit,limit);
        sqlSession.close();
        pageInfo.setData(goodsList);
        return pageInfo;
    }


    @Override
    public int updateGoods(Goods goods) {
        SqlSession sqlSession = sessionFactory.openSession(true);
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
        int count = mapper.updateGoods(goods);
        sqlSession.close();
        return count;
    }

    @Override
    public int deleteGoods(int goodsId) {
        SqlSession sqlSession = sessionFactory.openSession(true);
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
        int count = mapper.deleteGoods(goodsId);
        sqlSession.close();
        return count;
    }

    @Override
    public int insertGoodsList(List goodsList) {
        SqlSession sqlSession = sessionFactory.openSession(true);
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
        int count = mapper.insertGoods(goodsList);
        sqlSession.close();
        return count;
    }
}
