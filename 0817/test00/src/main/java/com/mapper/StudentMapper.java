package com.mapper;

import com.entity.Student;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/17 8:19
 */
public interface StudentMapper {
    List<Student> select();
    int update();
    int insert(List<Student> studentList);
    int delete();
}
