package com.wen.mapper;

import com.github.abel533.mapper.Mapper;
import com.wen.entity.Goods;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 8:30
 */

public interface GoodsMapper extends Mapper<Goods> {
    @Select("select * from tb_goods")
    @Results(
            @Result(
                    column = "category_id",
                    property = "category",
                    one = @One(select = "com.wen.mapper.CategoryMapper.select")
            )
    )
    List<Goods> goodsList();
}
