package com.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/17 8:17
 */
@Data
public class Student {
    private Integer studentId;
    private String name;
    private Date birthday;
    private String phone;
}
