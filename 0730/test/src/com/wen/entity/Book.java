package com.wen.entity;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 8:18
 */
public class Book {
    private Integer bookId;
    private String bookName;
    private String author;
    private Double price;
    private Date productionDate;

    public Book() {
    }

    public Book(Integer bookId, String bookName, String author, Double price, Date productionDate) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.productionDate = productionDate;
    }

    public Book(String bookName, String author, Double price, Date productionDate) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.productionDate = productionDate;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", productionDate=" + productionDate +
                '}';
    }
}
