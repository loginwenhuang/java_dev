package com.wen.service.impl;

import com.wen.dao.IGoodsDao;
import com.wen.dao.impl.GoodsDaoImpl;
import com.wen.entity.Goods;
import com.wen.service.IGoodsService;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 17:49
 */
public class GoodsServiceImpl implements IGoodsService {
    private IGoodsDao goodsDao = new GoodsDaoImpl();
    @Override
    public List<Map<String,Object>> goodsList() {
        return goodsDao.selectAllGoods();
    }

    @Override
    public List<Map<String, Object>> goodsByPage(Integer page, Integer limit) {
        return goodsDao.selectByPage(page,limit);
    }

    @Override
    public List<Map<String, Object>> addressList() {
        return goodsDao.addressList();
    }

    @Override
    public int addGoods(Goods goods) {
        return goodsDao.insertGoods(goods);
    }

    @Override
    public int updateGoods(Goods goods) {
        return goodsDao.updateGoods(goods);
    }

    @Override
    public int deleteGoods(String ids) {
        return goodsDao.deleteGoods(ids);
    }
}
