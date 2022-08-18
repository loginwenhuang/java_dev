package com.mapper;

import com.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/15 9:05
 */
public interface BookMapper {
    List<Book> bookList();
    int insert(Book book);
    int update(Book book);
    int delete(int bookId);

    Book getByNameAndPubDate(String bookName, Date pubDate);
    Book getByNameAndPubDate2(@Param("bookName") String bookName,@Param("pubDate") Date pubDate);
    Book getByMap(Map map);

    List<Book> getByBookNameLike(String bookName);
}
