package com.wen.dao;

import com.wen.entity.Goods;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 16:51
 */
public interface IGoodsDao {
    List<Goods> selectAllGoods();
}
