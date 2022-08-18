package com.wen.service.impl;

import com.wen.dao.IStaffDao;
import com.wen.dao.impl.StaffDaoImpl;
import com.wen.entity.Staff;
import com.wen.service.IStaffService;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 9:16
 */
public class StaffServiceImpl implements IStaffService {
    private IStaffDao staffDao = new StaffDaoImpl();
    @Override
    public List<Map<String, Object>> queryAllStaff() {
        return staffDao.queryAllStaff();
    }

    @Override
    public List<Map<String, Object>> querySomeStaff(String search) {
        return staffDao.querySomeStaff(search);
    }

    @Override
    public int insertStaff(Staff staff) {
        return staffDao.insertStaff(staff);
    }
}
