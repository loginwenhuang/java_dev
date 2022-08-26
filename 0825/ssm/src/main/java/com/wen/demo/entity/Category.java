package com.wen.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 11:11
 */
@Data
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "categoryId")
    private Integer categoryId;
    @Column(name = "categoryName")
    private String categoryName;
}
