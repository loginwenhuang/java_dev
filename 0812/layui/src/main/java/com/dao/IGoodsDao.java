package com.dao;

import com.entity.Goods;
import com.entity.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/12 17:38
 */
public interface IGoodsDao {
    PageInfo goodsListByPage(int page, int limit);

    int updateGoods(Goods goods);

    int deleteGoods(int goodsId);

    int insertGoodsList(List goodsList);

}
