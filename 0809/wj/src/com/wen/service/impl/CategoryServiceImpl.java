package com.wen.service.impl;

import com.wen.dao.ICategoryDao;
import com.wen.dao.impl.CategoryDaoImpl;
import com.wen.service.ICategoryService;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/9 16:49
 */
public class CategoryServiceImpl implements ICategoryService {
    private ICategoryDao categoryDao = new CategoryDaoImpl();
    @Override
    public List<Map<String, Object>> listCategory() {
        return categoryDao.listCategory();
    }
}
