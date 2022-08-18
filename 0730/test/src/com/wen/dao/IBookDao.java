package com.wen.dao;

import com.wen.entity.Book;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 8:17
 */
public interface IBookDao {
    /**
     * 查询全部图书
     * @return
     */
    List<Book> allBooks();
}
