package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/15 9:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer bookId;
    private String bookName;
    private String author;
    private Double price;
    private String press;
    private Date pubDate;
}
