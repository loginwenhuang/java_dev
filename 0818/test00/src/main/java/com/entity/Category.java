package com.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 8:17
 */
@Data
public class Category implements Serializable {
    private Integer categoryId;
    private String categoryName;
}
