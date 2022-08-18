package com.wen.dao.impl;

import com.wen.dao.IBookDao;
import com.wen.entity.Book;
import com.wen.util.BaseDao;

import javax.jws.Oneway;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 19:45
 */
public class BookDaoImpl implements IBookDao {
    @Override
    public List<Book> selectAllBook() {
        String sql = "select bookId,title,authors,unitPrice,pucDate from books";
        BaseDao.setPst(sql,null);
        List<Map<String,Object>> rows = BaseDao.executeQuery();
        List<Book> books = null;
        if(rows.size()>0){
            books =new ArrayList<>();
            for (Map map:rows) {
                books.add(new Book(
                        (Integer) map.get("bookId"),
                        (String)map.get("title"),
                        (String)map.get("authors"),
                        new BigDecimal(map.get("unitPrice").toString()).doubleValue(),
                        (Date) map.get("pucDate")
                ));
            }
        }
        return books;
    }
}
