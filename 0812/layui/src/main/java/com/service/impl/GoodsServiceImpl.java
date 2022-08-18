package com.service.impl;

import com.dao.IGoodsDao;
import com.dao.impl.GoodsDaoImpl;
import com.entity.Goods;
import com.entity.PageInfo;
import com.service.IGoodsService;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/13 10:54
 */
public class GoodsServiceImpl implements IGoodsService {
    private IGoodsDao goodsDao = new GoodsDaoImpl();

    @Override
    public PageInfo goodsListByPage(int page, int limit) {
        return goodsDao.goodsListByPage(page,limit);
    }

    @Override
    public int updateGoods(Goods goods) {
        return goodsDao.updateGoods(goods);
    }

    @Override
    public int deleteGoods(int goodsId) {
        return goodsDao.deleteGoods(goodsId);
    }

    @Override
    public int insertGoodsList(List goodsList) {
        return goodsDao.insertGoodsList(goodsList);
    }

}
