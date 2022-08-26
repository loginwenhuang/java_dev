package com.wen.mapper;

import com.wen.entity.Category;
import org.apache.ibatis.annotations.Select;


/**
 * @author :muxiaowen
 * @date : 2022/8/25 8:33
 */
public interface CategoryMapper {
    @Select("select * from category where categoryId = #{id}")
    Category select();
}
