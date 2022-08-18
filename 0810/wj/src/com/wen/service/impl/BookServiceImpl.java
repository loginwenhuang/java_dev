package com.wen.service.impl;

import com.wen.dao.IBookDao;
import com.wen.dao.impl.BookDaoImpl;
import com.wen.service.IBookService;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 9:18
 */
public class BookServiceImpl implements IBookService {
    private IBookDao bookDao = new BookDaoImpl();
    @Override
    public List<Map<String, Object>> allBooks(Integer page, Integer limit) {
        return bookDao.allBooks(page,limit);
    }

    @Override
    public int countBooks() {
        return bookDao.countBooks();
    }
}
