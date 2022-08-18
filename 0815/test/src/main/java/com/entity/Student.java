package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/15 8:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer studentId;
    private String name;
    private String sex;
    private Date birthday;
    private String phone;
}
