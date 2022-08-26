package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 9:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
@Component
public class Book {
    @Id
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private Double bookPrice;
    @Column(name = "book_pucDate")
    private Date bookPucDate;
}
