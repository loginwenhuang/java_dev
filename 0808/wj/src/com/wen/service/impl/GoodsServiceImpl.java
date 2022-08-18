package com.wen.service.impl;

import com.wen.dao.IGoodsDao;
import com.wen.dao.impl.GoodsDaoImpl;
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
}
