package com.wen.dao;

import com.wen.entity.Staff;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 9:06
 */
public interface IStaffDao {
    List<Map<String,Object>> queryAllStaff();
    List<Map<String,Object>> querySomeStaff(String search);
    int insertStaff(Staff staff);
}
