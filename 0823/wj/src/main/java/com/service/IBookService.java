package com.service;

import com.entity.Book;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 9:20
 */
public interface IBookService {
    List<Book> bookList();

    int insertBook(Book book);

    int deleteBook(Integer bookId);

    int updateBook(Book book);
}
