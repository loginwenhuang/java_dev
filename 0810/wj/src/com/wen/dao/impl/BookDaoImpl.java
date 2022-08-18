package com.wen.dao.impl;

import com.wen.dao.IBookDao;
import com.wen.util.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 9:13
 */
public class BookDaoImpl implements IBookDao {
    @Override
    public List<Map<String, Object>> allBooks(Integer page, Integer limit) {
        String sql = "select id,name,author,press,proDate,s_name" +
                "   from books,sort" +
                "   where books.sortId=sort.sortId" +
                "   order by id" +
                "   limit ?,?";
        return BaseDao.executeQuery(sql,new Object[]{
                (page-1)*limit,limit
        });
    }

    @Override
    public int countBooks() {
        String sql = "select count(id) form books";
        return BaseDao.getTotal(sql,null);
    }
}
