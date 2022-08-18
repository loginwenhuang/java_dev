package com.mapper;

import com.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/17 9:04
 */
public interface GoodsMapper {
    List<Goods> goodsList();
    List<Goods> goodsList2();

    List<Goods> selectByName(@Param("goodsName") String goodsName);

    List<Goods> selectByPrice(@Param("s_price") Double s_price,
                              @Param("e_price") Double e_price);
}
