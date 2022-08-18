package com.wen.service.impl;

import com.wen.dao.IDepartmentDao;
import com.wen.dao.impl.DepartmentDaoImpl;
import com.wen.service.IDepartmentService;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 15:20
 */
public class DepartmentServiceImpl implements IDepartmentService {
    private IDepartmentDao departmentDao = new DepartmentDaoImpl();
    @Override
    public List<Map<String, Object>> AllDepartment() {
        return departmentDao.queryAllDepartment();
    }
}
