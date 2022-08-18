package com.wen.service;

import com.wen.entity.Goods;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 17:48
 */
public interface IGoodsService {
    List<Map<String,Object>> goodsList();
    List<Map<String,Object>> goodsByPage(Integer page,Integer limit);
    List<Map<String,Object>> addressList();

    int addGoods(Goods goods);

    int updateGoods(Goods goods);

    int deleteGoods(String ids);
}
