package com.wen.dao.impl;

import com.wen.dao.IGoodsDao;
import com.wen.entity.Goods;
import com.wen.util.BaseDao;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 16:54
 */
public class GoodsDaoImpl implements IGoodsDao {
    @Override
    public List<Goods> selectAllGoods() {
        String sql = "select goodsId,goodsName,price,proDate,proAdd from goods";
        BaseDao.setPst(sql,null);
        List<Map<String,Object>> rows = BaseDao.executeQuery();
        List<Goods> allGoods = new ArrayList<>();
        if(rows.size()>0){
            for (Map map :rows) {
                Goods goods = new Goods(
                        (Integer) map.get("goodsId"),
                        (String) map.get("goodsName"),
                        new BigDecimal(map.get("price").toString()).doubleValue(),
                        (Date)map.get("proDate"),
                        (String)map.get("proAdd")
                );
                allGoods.add(goods);
            }
            return allGoods;
        }
        return null;
    }
}
