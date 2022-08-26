package com.mapper;

import com.entity.Category;
import com.entity.Goods;
import com.github.abel533.mapper.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import javax.rmi.CORBA.StubDelegate;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 20:19
 */
public interface CategoryMapper extends Mapper<Category> {
    @Select("select * from category where categoryId = #{id}")
    List<Category> categoryList();
}
