package com.mapper;

import com.entity.Student;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 9:04
 */
public interface StudentMapper {
    List<Student> studentList();

    int insert(Student student);

    int update(Student student);

    int delete(Integer id);
}
