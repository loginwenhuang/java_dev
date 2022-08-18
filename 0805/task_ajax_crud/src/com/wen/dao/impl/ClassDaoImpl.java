package com.wen.dao.impl;

import com.wen.dao.IClassDao;
import com.wen.util.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/5 20:56
 */
public class ClassDaoImpl implements IClassDao {

    @Override
    public List<Map<String,Object>> allClass() {
        String sql = "select classId,className from classInfo";
        return BaseDao.executeQuery(sql,null);
    }
}
