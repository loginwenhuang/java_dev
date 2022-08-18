package com.wen.dao.impl;

import com.wen.dao.IDepartmentDao;
import com.wen.util.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 15:17
 */
public class DepartmentDaoImpl implements IDepartmentDao {
    @Override
    public List<Map<String, Object>> queryAllDepartment() {
        String sql = "select d_id,d_name from department";
        return BaseDao.executeQuery(sql,null);
    }
}
