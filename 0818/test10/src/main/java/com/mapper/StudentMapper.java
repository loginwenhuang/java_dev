package com.mapper;

import com.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 15:56
 */
public interface StudentMapper {
    @Select("select * from student")
    List<Student> studentList();
}
