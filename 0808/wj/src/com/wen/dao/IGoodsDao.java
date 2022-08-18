package com.wen.dao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 17:36
 */
public interface IGoodsDao {
    List<Map<String,Object>> selectAllGoods();
}
