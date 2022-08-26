package com.test;

import com.entity.Book;
import com.mapper.BookMapper;
import com.service.IBookService;
import com.service.impl.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 9:15
 */
public class Test2 {
    public static void main(String[] args) {
        ApplicationContext ac =new ClassPathXmlApplicationContext("spring-mybatis.xml");
        IBookService bookService = ac.getBean(BookService.class);
        bookService.insertBook(new Book(null,"西游记1","吴承恩",42.0,
                java.sql.Date.valueOf("2022-8-8")));
        bookService.updateBook(new Book(7,"西游记1","吴承恩",42.0,
                java.sql.Date.valueOf("2022-8-8")));
        bookService.deleteBook(5);
        bookService.bookList().forEach(System.out::println);
    }
}
