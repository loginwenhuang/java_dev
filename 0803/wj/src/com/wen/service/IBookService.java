package com.wen.service;

import com.wen.entity.Book;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/3 9:16
 */
public interface IBookService {
    List<Book> selectAllBook();
    List<Book> selectSomeBook(String[] conditions,int n);
}
