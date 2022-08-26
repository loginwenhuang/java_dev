package com.mapper;

import com.entity.Category;
import com.entity.Goods;
import com.github.abel533.mapper.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 17:02
 */
public interface GoodsMapper extends Mapper<Goods>{
    @Select("select * from tb_goods")
    @Results(
            @Result(
                    property = "category",
                    column = "category_id",
                    one = @One(select = "com.mapper.CategoryMapper.categoryList")
            )
    )
    List<Goods> goodsList();
}
