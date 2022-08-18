package com.wen.service.impl;

import com.wen.dao.IGoodsDao;
import com.wen.dao.impl.GoodsDaoImpl;
import com.wen.entity.Goods;
import com.wen.service.IGoodsService;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 17:00
 */
public class GoodsServiceImpl implements IGoodsService {
    IGoodsDao goodsDao = new GoodsDaoImpl();
    @Override
    public List<Goods> Goodses() {
        return goodsDao.selectAllGoods();
    }
}
