package com.mu.test1;

/**
 * @author :muxiaowen
 * @date : 2022/7/2 11:28
 */
public class Test1 {
    public static void main(String[] args) {
        Person person = new Person("wen",20,"男");
        System.out.println(person);

        final Book book =new Book(1001,50);
        System.out.println(book);
        book.price = 35;
        //book.id = 50;
        System.out.println(book);

        //book = new Book(1002,70);

    }
}