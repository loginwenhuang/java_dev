package com.wen.demo.service;

import com.wen.demo.entity.Category;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 17:16
 */
public interface ICategoryService {
    List<Category> categoryList();
    int insert(Category category);
    int update(Category category);
    int delete(Integer categoryId);
}
