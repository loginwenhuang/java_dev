package com.wen.dao.impl;

import com.wen.dao.IGoodsDao;
import com.wen.util.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 17:37
 */
public class GoodsDaoImpl implements IGoodsDao {
    @Override
    public List<Map<String, Object>> selectAllGoods() {
        String sql ="select goodsId,goodsName,price,produceDate,address,categoryName" +
                "   from goods join category" +
                "   on goods.categoryId = category.categoryId";
        return BaseDao.executeQuery(sql,null);
    }
}
