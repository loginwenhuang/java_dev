package com.wen.dao;

import com.wen.entity.Goods;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 17:36
 */
public interface IGoodsDao {
    List<Map<String,Object>> selectAllGoods();
    public List<Map<String, Object>> selectByPage(Integer page,Integer limit);
    List<Map<String,Object>> addressList();

    int insertGoods(Goods goods);

    int updateGoods(Goods goods);

    int deleteGoods(String ids);
}
