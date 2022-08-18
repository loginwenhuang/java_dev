package com.dao.impl;

import com.dao.IBookDao;
import com.entity.Book;
import com.mapper.BookMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/15 9:14
 */
public class BookDaoImpl implements IBookDao {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("MyBatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Book> bookList() {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        return mapper.bookList();
    }

    @Override
    public int insert(Book book) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        return mapper.insert(book);
    }

    @Override
    public int update(Book book) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);


        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        return mapper.update(book);
    }


    @Override
    public int delete(int bookId) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        return mapper.delete(bookId);
    }
}
