package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/17 9:03
 */
@Data
public class Category implements Serializable{
    private Integer categoryId;
    private String categoryName;

    private List<Goods> goodsList;
}
