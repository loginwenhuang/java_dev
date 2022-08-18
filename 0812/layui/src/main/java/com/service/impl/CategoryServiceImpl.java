package com.service.impl;

import com.dao.ICategoryDao;
import com.dao.impl.CategoryDaoImpl;
import com.entity.Category;
import com.service.ICategoryService;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/17 19:18
 */
public class CategoryServiceImpl implements ICategoryService {
    private ICategoryDao categoryDao = new CategoryDaoImpl();
    @Override
    public List<Category> categoryList() {
        return categoryDao.categoryList();
    }
}
