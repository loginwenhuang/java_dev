package com.wen.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wen.demo.entity.Goods;
import com.wen.demo.mapper.GoodsMapper;
import com.wen.demo.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 11:13
 */
@Service
public class GoodsServiceImpl implements IGoodsService{
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public PageInfo<Goods> goodsList(int page,int limit) {
        PageHelper.startPage(page,limit);

        return new PageInfo<>(goodsMapper.goodsList());
    }

    @Override
    public int goodsAdd(Goods goods) {
        return goodsMapper.insert(goods);
    }
}
