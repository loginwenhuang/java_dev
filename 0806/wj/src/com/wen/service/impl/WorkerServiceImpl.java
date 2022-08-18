package com.wen.service.impl;

import com.wen.dao.IWorkerDao;
import com.wen.dao.impl.WorkerDaoImpl;
import com.wen.service.IWorkerService;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/6 9:08
 */
public class WorkerServiceImpl implements IWorkerService {
    IWorkerDao workerDao = new WorkerDaoImpl();
    @Override
    public List<Map<String, Object>> allWorker() {
        return workerDao.selectAllWorker();
    }
}

