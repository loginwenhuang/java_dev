package com.wen.service.impl;

import com.wen.dao.IBookDao;
import com.wen.dao.impl.BookDaoImpl;
import com.wen.entity.Book;
import com.wen.service.IBookService;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/3 9:16
 */
public class BookServiceImpl implements IBookService {
    IBookDao bookDao = new BookDaoImpl();
    @Override
    public List<Book> selectAllBook() {
        return bookDao.selectAllBook();
    }

    @Override
    public List<Book> selectSomeBook(String[] conditions,int n) {
        return bookDao.selectSomeBook(conditions,n);
    }
}
