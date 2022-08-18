package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/12 17:36
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
