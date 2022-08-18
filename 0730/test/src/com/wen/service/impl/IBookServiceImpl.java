package com.wen.service.impl;

import com.wen.dao.IBookDao;
import com.wen.dao.impl.IBookDaoImpl;
import com.wen.entity.Book;
import com.wen.service.IBookService;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 8:28
 */
public class IBookServiceImpl implements IBookService {
    IBookDao bookDao  = new IBookDaoImpl();
    @Override
    public List<Book> allBooks() {
        return bookDao.allBooks();
    }
}
