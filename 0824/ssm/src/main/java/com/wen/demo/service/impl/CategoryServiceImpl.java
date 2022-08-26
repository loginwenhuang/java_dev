package com.wen.demo.service.impl;

import com.wen.demo.entity.Category;
import com.wen.demo.mapper.CategoryMapper;
import com.wen.demo.service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 17:17
 */
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> categoryList() {
        return categoryMapper.select(null);
    }

    @Override
    public int insert(Category category) {
        return categoryMapper.insert(category);
    }

    @Override
    public int update(Category category) {
        return categoryMapper.updateByPrimaryKey(category);
    }

    @Override
    public int delete(Integer categoryId) {
        return categoryMapper.deleteByPrimaryKey(categoryId);
    }
}
