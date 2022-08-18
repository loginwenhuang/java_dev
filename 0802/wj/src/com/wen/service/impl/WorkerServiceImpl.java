package com.wen.service.impl;

import com.wen.dao.IWorkerDao;
import com.wen.dao.impl.IWorkerDaoImpl;
import com.wen.dao.impl.WorkerDaoImpl;
import com.wen.entity.PageData;
import com.wen.entity.Worker;
import com.wen.service.IWorkerService;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/2 9:14
 */
public class WorkerServiceImpl implements IWorkerService {
    IWorkerDao workerDao = new IWorkerDaoImpl();
    IWorkerDao iWorkerDao = new WorkerDaoImpl();
    @Override
    public List<Worker> selectAll() {
        return workerDao.selectAll();
    }

    @Override
    public Worker selectById(Integer id) {
        return workerDao.selectById(id);
    }

    @Override
    public boolean insert(Worker worker) {
        return workerDao.insert(worker)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return workerDao.delete(id)>0;
    }

    @Override
    public boolean update(Worker woreker) {
        return workerDao.update(woreker)>0;
    }

    @Override
    public List<Worker> search(String condition) {
        return workerDao.selectSome(condition,1);
        //return iWorkerDao.selectSome(condition,1);
    }

    @Override
    public PageData listByPage(Integer pageNo, Integer pageSize) {
        return workerDao.listByPage(pageNo,pageSize);
    }

    @Override
    public PageData listByPageAndSome(String condition, Integer pageNo, Integer pageSize) {
        return workerDao.listByPageAndSome(condition,pageNo,pageSize);
    }

    @Override
    public boolean resetList() {
        return workerDao.resetList(workerDao.selectAll());
    }
}
