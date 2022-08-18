package com.wen.dao.impl;

import com.wen.dao.IStaffDao;
import com.wen.util.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/7 14:50
 */
public class StaffDaoImpl implements IStaffDao {
    @Override
    public List<Map<String, Object>> allStaff() {
        String sql = "select * from staff";
        return BaseDao.executeQuery(sql,null);
    }
}
