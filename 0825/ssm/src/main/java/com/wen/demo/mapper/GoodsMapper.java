package com.wen.demo.mapper;

import com.github.abel533.mapper.Mapper;
import com.wen.demo.entity.Goods;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 11:12
 */
public interface GoodsMapper extends Mapper<Goods> {
    List<Goods> goodsList();
}
