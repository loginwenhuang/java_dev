package com.service.impl;

import com.entity.Book;
import com.mapper.BookMapper;
import com.service.IBookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 9:22
 */
@Service
public class BookService implements IBookService {

    @Resource
    private  BookMapper bookMapper;

    @Override
    public List<Book> bookList() {
        return bookMapper.select(null);
    }

    @Override
    public int insertBook(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public int deleteBook(Integer bookId) {
        return bookMapper.deleteByPrimaryKey(bookId);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateByPrimaryKey(book);
    }
}
