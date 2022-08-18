package com.wen.entity;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 19:40
 */
public class Book {
    private Integer bookId;
    private String title;
    private String authors;
    private Double unitPrice;
    private Date pucDate;

    public Book() {
    }

    public Book(Integer bookId, String title, String authors, Double unitPrice, Date pucDate) {
        this.bookId = bookId;
        this.title = title;
        this.authors = authors;
        this.unitPrice = unitPrice;
        this.pucDate = pucDate;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getPucDate() {
        return pucDate;
    }

    public void setPucDate(Date pucDate) {
        this.pucDate = pucDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", unitPrice=" + unitPrice +
                ", pucDate=" + pucDate +
                '}';
    }
}
