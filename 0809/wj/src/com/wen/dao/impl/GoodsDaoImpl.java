package com.wen.dao.impl;

import com.wen.dao.IGoodsDao;
import com.wen.entity.Goods;
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
    @Override
    public List<Map<String, Object>> selectByPage(Integer page,Integer limit) {
        String sql ="select goodsId,goodsName,price,produceDate,address,categoryName" +
                "   from goods join category" +
                "   on goods.categoryId = category.categoryId" +
                "   order by goodsId" +
                "   limit ?,?";
        return BaseDao.executeQuery(sql,new Object[]{(page-1)*limit,limit});
    }

    @Override
    public List<Map<String, Object>> addressList() {
        String sql = "select address from goods " +
                "   group by address";
        return BaseDao.executeQuery(sql,null);
    }

    @Override
    public int insertGoods(Goods goods) {
        String sql = "insert into goods(goodsName,price,produceDate,address,categoryId)" +
                "   value (?,?,?,?,?)";
        return BaseDao.executeUpdate(sql,new Object[]{
                goods.getGoodsName(),
                goods.getPrice(),
                goods.getProduceDate(),
                goods.getAddress(),
                goods.getCategoryId()
        });
    }

    @Override
    public int updateGoods(Goods goods) {
        String sql = "update goods" +
                "   set goodsName = ?," +
                "       price = ?," +
                "       produceDate = ?," +
                "       address = ?," +
                "       categoryId= ?" +
                "   where goodsId = ?";
        return BaseDao.executeUpdate(sql,new Object[]{
                goods.getGoodsName(),
                goods.getPrice(),
                goods.getProduceDate(),
                goods.getAddress(),
                goods.getCategoryId(),
                goods.getGoodsId()
        });
    }

    @Override
    public int deleteGoods(String ids) {
        String sql = "delete from goods where goodsId in ("+ids+")";
        return BaseDao.executeUpdate(sql,null);
    }
}
