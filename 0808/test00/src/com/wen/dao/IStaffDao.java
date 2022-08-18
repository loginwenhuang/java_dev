package com.wen.dao;

import com.wen.entity.Staff;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 14:46
 */
public interface IStaffDao {
    List<Map<String,Object>> queryStaff();
    List<Map<String,Object>> querySomeStaff(String search);
    int insertStaff(Staff staff);
}
