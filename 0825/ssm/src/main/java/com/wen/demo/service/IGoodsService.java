package com.wen.demo.service;

import com.github.pagehelper.PageInfo;
import com.wen.demo.entity.Goods;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 11:12
 */
public interface IGoodsService {
    PageInfo<Goods> goodsList(int page,int limit);

    int goodsAdd(Goods goods);
}
