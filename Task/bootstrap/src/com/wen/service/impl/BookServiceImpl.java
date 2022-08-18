package com.wen.service.impl;

import com.wen.dao.IBookDao;
import com.wen.dao.impl.BookDaoImpl;
import com.wen.entity.Book;
import com.wen.service.IBookService;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 19:59
 */
public class BookServiceImpl implements IBookService {
    IBookDao bookDao = new BookDaoImpl();
    @Override
    public List<Book> allBooks() {
        return bookDao.selectAllBook();
    }
}
