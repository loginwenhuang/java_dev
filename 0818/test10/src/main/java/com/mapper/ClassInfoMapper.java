package com.mapper;

import com.entity.ClassInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 20:46
 */
public interface ClassInfoMapper {
    @Select("select * from classinfo where class_id = #{id}")
    List<ClassInfo> classList();
}
