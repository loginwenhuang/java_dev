package com.mapper;

import com.entity.Student;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 15:56
 */
public interface StudentMapper {
    @Select("select * from stu")
    @Results(
            @Result(
                    property = "classInfo",
                    column = "clsId",
                    one = @One(select = "com.mapper.ClassInfoMapper.classList")
            ))
    List<Student> studentList();
}
