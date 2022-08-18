package com.entity;

import lombok.Data;

import java.util.Calendar;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/16 9:04
 */
@Data
public class StudentInfo {
    private Integer studentId;
    private String name;
    private String sex;
    private Date birthday;
    private String province;
    private Integer classId;

    private ClassInfo classInfo;
}
