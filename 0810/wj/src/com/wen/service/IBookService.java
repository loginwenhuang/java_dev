package com.wen.service;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 9:17
 */
public interface IBookService {
    List<Map<String,Object>> allBooks(Integer page, Integer limit);
    int countBooks();
}
