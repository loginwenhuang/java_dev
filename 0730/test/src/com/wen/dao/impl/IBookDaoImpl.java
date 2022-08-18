package com.wen.dao.impl;

import com.wen.dao.IBookDao;
import com.wen.entity.Book;
import com.wen.util.BaseDao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 8:21
 */
public class IBookDaoImpl implements IBookDao {
    @Override
    public List<Book> allBooks() {
        String sql = "select bookId,bookName,author,price,productionDate " +
                "   from books";
        BaseDao.setPst(sql,null);
        List<Map<String,Object>> rows = BaseDao.executeQuery();
        List<Book> books = new ArrayList<>();
        if(rows.size()>0){
            for (Map map:rows) {
                Book book = new Book(
                        (Integer) map.get("bookId"),
                        (String) map.get("bookName"),
                        (String) map.get("author"),
                        new BigDecimal(map.get("price").toString()).doubleValue(),
                        (Date)map.get("productionDate")
                );
                books.add(book);
            }
            return books;
        }
        return null;
    }
}
