package com.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 15:55
 */
@Data
public class Student {
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
}
