package com.wen.service;

import com.wen.entity.Staff;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 15:19
 */
public interface IStaffInfoService {
    List<Map<String,Object>> AllStaffInfo();
    int addStaff(Staff staff);
}
