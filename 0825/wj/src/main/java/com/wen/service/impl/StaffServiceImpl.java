package com.wen.service.impl;

import com.wen.entity.Staff;
import com.wen.mapper.StaffMapper;
import com.wen.service.IStaffService;
import org.apache.ibatis.annotations.Results;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 9:07
 */
@Service
public class StaffServiceImpl implements IStaffService {
    @Resource
    private StaffMapper staffMapper;
    @Override
    public List<Staff> staffList() {
        return staffMapper.staffList();
    }
}
