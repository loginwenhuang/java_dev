package com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 8:17
 */
@Data
public class Goods implements Serializable {
    private Integer goodsId;
    private String goodsName;
    private Double price;
    private Date produceDate;
    private String address;

    private Category category;
}
