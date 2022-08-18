package com.wen.dao.impl;

import com.wen.dao.ICategoryDao;
import com.wen.util.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/9 16:43
 */
public class CategoryDaoImpl implements ICategoryDao {
    @Override
    public List<Map<String, Object>> listCategory() {
        String sql = "select categoryId,categoryName from category";
        return BaseDao.executeQuery(sql,null);
    }
}
