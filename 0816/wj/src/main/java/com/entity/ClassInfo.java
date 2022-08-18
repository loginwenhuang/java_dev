package com.entity;

import lombok.Data;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/16 9:06
 */
@Data
public class ClassInfo {
    private Integer classId;
    private String className;

    private List<StudentInfo> studentList;
}
