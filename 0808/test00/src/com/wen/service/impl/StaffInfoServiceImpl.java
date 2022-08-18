package com.wen.service.impl;

import com.wen.dao.IStaffDao;
import com.wen.dao.impl.StaffDaoImpl;
import com.wen.entity.Staff;
import com.wen.service.IStaffInfoService;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 15:19
 */
public class StaffInfoServiceImpl implements IStaffInfoService {
    private IStaffDao staffDao = new StaffDaoImpl();
    @Override
    public List<Map<String, Object>> AllStaffInfo() {
        return staffDao.queryStaff();
    }

    @Override
    public int addStaff(Staff staff) {
        return staffDao.insertStaff(staff);
    }
}
