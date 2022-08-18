package com.wen.service;

import com.wen.entity.Book;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 19:57
 */
public interface IBookService {
    /**
     * 所有图书
     * @return
     */
    List<Book> allBooks();
}
