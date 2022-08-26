package com.wen.mapper;

import com.wen.entity.Staff;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 9:04
 */
public interface StaffMapper {
    @Select("select s_id,s_name,sex,birthday,d_id from staffinfo")
    @Results(
            @Result(
                    column = "d_id",
                    property = "department",
                    one = @One(select = "com.wen.mapper.DepartmentMapper.list")
            )
    )
    List<Staff> staffList();
}
