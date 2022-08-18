package com.wen.dao.impl;

import com.wen.dao.IGoodsDao;
import com.wen.entity.Goods;
import com.wen.util.BaseDao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 9:07
 */
public class IGoodsDaoImpl implements IGoodsDao {
    @Override
    public List<Goods> goodsList() {
        String sql = "select goodId,goodName,price,pucDate,pucAddress from goods";
        BaseDao.setPst(sql,null);
        List<Goods> goodsList = new ArrayList<>();
        List<Map<String,Object>> rows = BaseDao.executeQuery();
        if(rows.size()>0){
            for (Map map : rows) {
                Goods goods = new Goods(
                        (Integer) map.get("goodId"),
                        (String) map.get("goodName"),
                        new BigDecimal(map.get("price").toString()).doubleValue(),
                        (Date)map.get("pucDate"),
                        (String) map.get("pucAddress")
                );
                goodsList.add(goods);
            }
            return goodsList;
        }
        return null;
    }
}
