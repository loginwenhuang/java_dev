package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 16:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_goods")
public class Goods {
    @Id
    private Integer goodsId;
    @Column(name = "goods_name")
    private String goodsName;
    private Double price;
    private Date produceDate;
    private String address;


    private Category category;
}
