package com.entity;

import lombok.Data;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/15 19:05
 */
@Data
public class Category {
    private Integer categoryId;
    private String categoryName;

    private List<Goods> goodsList;
}
