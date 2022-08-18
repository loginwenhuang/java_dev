package com.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/16 8:04
 */
@Data
public class Goods {
    private Integer goodsId;
    private String goodsName;
    private Double price;
    private Date produceDate;
    private String address;
    private Integer categoryId;

    private Category category;
}
