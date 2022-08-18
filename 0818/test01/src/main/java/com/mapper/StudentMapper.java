package com.mapper;

import com.entity.Student;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 14:51
 */
public interface StudentMapper {
    List<Student> studentList();

    int delete(Integer id);
}
