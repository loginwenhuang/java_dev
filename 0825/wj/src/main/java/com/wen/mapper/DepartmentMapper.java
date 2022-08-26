package com.wen.mapper;

import com.wen.entity.Department;
import org.apache.ibatis.annotations.Select;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 9:06
 */
public interface DepartmentMapper {
    @Select("select * from department where d_id = #{id}")
    Department list();
}
