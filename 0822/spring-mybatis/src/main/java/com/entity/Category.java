package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Select;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 20:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "categoryId")
    private Integer categoryId;
    @Column(name = "categoryName")
    private String categoryName;
}
