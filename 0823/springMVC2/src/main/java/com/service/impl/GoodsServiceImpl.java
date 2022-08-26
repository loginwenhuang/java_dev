package com.service.impl;

import com.entity.Goods;
import com.mapper.GoodsMapper;
import com.service.IGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 19:56
 */
@Service
public class GoodsServiceImpl implements IGoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> goodsList() {
        return goodsMapper.select(null);
    }
}
