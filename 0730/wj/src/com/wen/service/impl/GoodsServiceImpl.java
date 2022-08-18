package com.wen.service.impl;

import com.wen.dao.IGoodsDao;
import com.wen.dao.impl.IGoodsDaoImpl;
import com.wen.entity.Goods;
import com.wen.service.IGoodsService;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 9:12
 */
public class GoodsServiceImpl implements IGoodsService {
    IGoodsDao goodsDao = new IGoodsDaoImpl();
    @Override
    public List<Goods> goodsList() {
        return goodsDao.goodsList();
    }
}
