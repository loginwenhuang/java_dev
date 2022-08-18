package com.wen.dao;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/5 20:52
 */
public interface IClassDao {
    /**
     * 查询全部的班级
     * @return
     */
    List<Map<String,Object>> allClass();
}
