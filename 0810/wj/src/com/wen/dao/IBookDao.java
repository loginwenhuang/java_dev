package com.wen.dao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 9:12
 */
public interface IBookDao {
    List<Map<String,Object>> allBooks(Integer page,Integer limit);
    int countBooks();
}
