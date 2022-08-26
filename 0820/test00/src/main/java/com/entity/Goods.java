package com.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 8:28
 */
@Data
@Table(name = "tb_goods")
public class Goods {
    @Id
    private Integer goodsId;
    private String goodsName;
    private Double price;
    private Date produceDate;
    private String address;
    private Integer categoryId;
}
