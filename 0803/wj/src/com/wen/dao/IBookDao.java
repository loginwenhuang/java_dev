package com.wen.dao;

import com.wen.entity.Book;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/3 9:00
 */
public interface IBookDao {
    List<Book> selectAllBook();
    List<Book> selectSomeBook(String[] conditions,int n);
}
