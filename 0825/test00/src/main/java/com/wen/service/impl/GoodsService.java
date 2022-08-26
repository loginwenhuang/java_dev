package com.wen.service.impl;

import com.wen.entity.Goods;
import com.wen.mapper.GoodsMapper;
import com.wen.service.IGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 8:39
 */
@Service
public class GoodsService implements IGoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> goodsList() {
        return goodsMapper.goodsList();
    }
}
