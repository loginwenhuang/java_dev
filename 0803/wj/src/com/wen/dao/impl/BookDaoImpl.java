package com.wen.dao.impl;

import com.mysql.cj.util.StringUtils;
import com.wen.dao.IBookDao;
import com.wen.entity.Book;
import com.wen.util.BaseDao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.prefs.BackingStoreException;

/**
 * @author :muxiaowen
 * @date : 2022/8/3 9:04
 */
public class BookDaoImpl implements IBookDao {
    @Override
    public List<Book> selectAllBook() {
        String sql = "select * from book";
        BaseDao.setPst(sql,null);
        List<Map<String,Object>> rows = BaseDao.executeQuery();
        List<Book> books = new ArrayList<>();
        if(rows.size()>0){
            for (Map map: rows) {
                Book book = new Book(
                        (Integer) map.get("id"),
                        (String) map.get("name"),
                        (String) map.get("author"),
                        new BigDecimal(map.get("price").toString()).doubleValue(),
                        (Date)map.get("prcDate")
                );
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public List<Book> selectSomeBook(String[] conditions,int n) {
        String sql = "select * from book";
        List<Object> params = new ArrayList<>();
        for (String s:conditions) {
            params.add("%"+s+"%");
        }
        switch (n){
            case 1:
                sql = "select * from book where name like ?";
                break;
            case 2:
                sql = "select * from book where author like ?";
                break;
            case 3:
                sql = "select * from book where name like ? and author like ?";
                break;
            default:
                break;
        }
        BaseDao.setPst(sql, params.toArray());
        List<Map<String,Object>> rows = BaseDao.executeQuery();
        List<Book> books = new ArrayList<>();
        if(rows.size()>0){
            for (Map map: rows) {
                Book book = new Book(
                        (Integer) map.get("id"),
                        (String) map.get("name"),
                        (String) map.get("author"),
                        new BigDecimal(map.get("price").toString()).doubleValue(),
                        (Date)map.get("prcDate")
                );
                books.add(book);
            }
            return books;
        }
        return null;
    }
}
