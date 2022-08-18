package com.wen.dao.impl;

import com.wen.dao.IWorkerDao;
import com.wen.util.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/6 9:06
 */
public class WorkerDaoImpl implements IWorkerDao {
    @Override
    public List<Map<String, Object>> selectAllWorker() {
        String sql = "select * from worker";
        BaseDao.setPst(sql,null);
        return BaseDao.executeQuery();
    }
}
