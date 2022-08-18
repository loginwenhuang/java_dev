package com.wen.service.impl;

import com.wen.dao.IStaffDao;
import com.wen.dao.impl.StaffDaoImpl;
import com.wen.service.IStaffService;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/7 14:53
 */
public class StaffServiceImpl implements IStaffService {
    private IStaffDao staffDao = new StaffDaoImpl();
    @Override
    public List<Map<String, Object>> queryAllStaff() {
        return staffDao.allStaff();
    }
}
