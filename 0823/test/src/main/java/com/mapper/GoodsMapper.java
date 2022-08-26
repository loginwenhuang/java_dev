package com.mapper;

import com.github.abel533.mapper.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 8:35
 */
public interface GoodsMapper extends Mapper<Map> {
    @Select("select * from tb_goods")
    List<Map> goodsList();
}
