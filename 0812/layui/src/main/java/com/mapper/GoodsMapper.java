package com.mapper;

import com.entity.Goods;
import com.entity.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/13 15:04
 */
public interface GoodsMapper {
    /**
     * 总数据数
     * @return
     */
    int getTotalCount();
    /**
     * 分页查询
     * @param page
     * @param limit
     * @return
     */
    List<Goods> goodsListByPage(int page,int limit);

    /**
     * 插入数据，可多条添加
     * @param goodsList
     * @return
     */
    int insertGoods(List<Goods> goodsList);

    /**
     * 单商品修改
     * @param goods
     * @return
     */
    int updateGoods(Goods goods);

    /**
     * 单商品删除
     * @param goodsId
     * @return
     */
    int deleteGoods(int goodsId);

}
