package com.mu.test1;

/**
 * @author :muxiaowen
 * @date : 2022/7/2 11:30
 */
public class Book {
    final int id;
    int price;

    public Book() {
        this.id = 1001;
    }

    public Book(int id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
    final public void sell(){
        System.out.println("卖");
    }
}
