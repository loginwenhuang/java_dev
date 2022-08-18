package com.mapper;

import com.entity.Goods;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/15 15:04
 */
public interface GoodsMapper {
    List<Goods> goodsList(int page,int limit);
}
