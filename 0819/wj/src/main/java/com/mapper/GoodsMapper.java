package com.mapper;

import com.entity.Goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/19 9:04
 */
public interface GoodsMapper {
    @Select("select * from goods")
    List<Goods> goodsList();
}
