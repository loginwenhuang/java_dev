package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 14:50
 */
@Data
public class Student implements Serializable {
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
}
