package com.dao;

import com.entity.Book;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/15 9:13
 */
public interface IBookDao {
    List<Book> bookList();
    int insert(Book book);
    int update(Book book);
    int delete(int bookId);
}
