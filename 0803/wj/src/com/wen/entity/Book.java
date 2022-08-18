package com.wen.entity;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/3 9:00
 */
public class Book {
    private Integer id;
    private String name;
    private String author;
    private Double price;
    private Date prcDate;

    public Book(Integer id, String name, String author, Double price, Date prcDate) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.prcDate = prcDate;
    }
    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getPrcDate() {
        return prcDate;
    }

    public void setPrcDate(Date prcDate) {
        this.prcDate = prcDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", prcDate=" + prcDate +
                '}';
    }
}
