package com.wen.entity;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 8:29
 */
@Data
@Table(name = "tb_goods")
public class Goods {
    @Id
    private Integer goodsId;
    private String goodsName;
    private Double price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date produceDate;
    private String address;
    private Integer categoryId;

    @Transient
    private Category category;

}
