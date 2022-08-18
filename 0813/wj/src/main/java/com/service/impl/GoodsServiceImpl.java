package com.service.impl;

import com.dao.IGoodsDao;
import com.dao.impl.GoodsDaoImpl;
import com.service.IGoodsService;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/13 9:07
 */
public class GoodsServiceImpl implements IGoodsService {
    private IGoodsDao goodsDao = new GoodsDaoImpl();
    @Override
    public List<Map> goodsList() throws IOException {
        return goodsDao.goodsList();
    }
}
