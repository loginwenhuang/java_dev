package com.service;

import com.entity.Goods;
import com.entity.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/13 10:54
 */
public interface IGoodsService {
    PageInfo goodsListByPage(int page, int limit);

    int updateGoods(Goods goods);

    int deleteGoods(int goodsId);

    int insertGoodsList(List goodsList);

}
