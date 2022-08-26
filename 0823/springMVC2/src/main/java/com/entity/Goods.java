package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 19:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
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
