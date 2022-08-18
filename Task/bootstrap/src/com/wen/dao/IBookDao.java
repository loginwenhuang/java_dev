package com.wen.dao;

import com.wen.entity.Book;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 19:40
 */
public interface IBookDao {
    /**
     * 全部图书
     * @return
     */
    List<Book> selectAllBook();
}
