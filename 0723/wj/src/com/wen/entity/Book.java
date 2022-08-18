package com.wen.entity;

/**
 * @author :muxiaowen
 * @date : 2022/7/23 15:34
 */
public class Book {
    /**
     * book_id, book_name, book_author, book_price, book_pucDate, book_Storage_location
     */
    private int book_id;
    private String book_name;
    private String book_price;
    private String book_pucDate;
    private String book_Storage_location;

    public Book(){}

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_price() {
        return book_price;
    }

    public void setBook_price(String book_price) {
        this.book_price = book_price;
    }

    public String getBook_pucDate() {
        return book_pucDate;
    }

    public void setBook_pucDate(String book_pucDate) {
        this.book_pucDate = book_pucDate;
    }

    public String getBook_Storage_location() {
        return book_Storage_location;
    }

    public void setBook_Storage_location(String book_Storage_location) {
        this.book_Storage_location = book_Storage_location;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", book_price='" + book_price + '\'' +
                ", book_pucDate='" + book_pucDate + '\'' +
                ", book_Storage_location='" + book_Storage_location + '\'' +
                '}';
    }
}
