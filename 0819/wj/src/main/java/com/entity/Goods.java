package com.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/19 9:02
 */
@Data
@Table(name = "tb_goods")
public class Goods implements Serializable {
    @Id
    private Integer goodsId;
    private String goodsName;
    private Double price;
    private Date produceDate;
    private String address;
    private Integer categoryId;
}
