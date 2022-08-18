package com.wen.dao.impl;

import com.wen.dao.IWorkerDao;
import com.wen.entity.PageData;
import com.wen.entity.Worker;
import com.wen.util.BaseDao;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/4 8:51
 */
public class TestWOrkerDaoImpl implements IWorkerDao {
    @Override
    public List<Worker> selectAll() {
        return null;
    }

    @Override
    public Worker selectById(Integer id) {
        return null;
    }

    @Override
    public int insert(Worker worker) {
        return 0;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    @Override
    public int update(Worker woreker) {
        return 0;
    }

    @Override
    public List<Worker> selectSome(Object condition, int n) {
        return null;
    }

    @Override
    public PageData listByPage(Integer pageNo, Integer pageSize) {
        PageData pageData = new PageData();
        String sql = "select * from worker";
        BaseDao.setPst(sql,null);
        pageData.setTotalCount(BaseDao.getTotal());
        if(pageData.getTotalCount()==0){
            pageData.setPageNo(pageNo);
            pageData.setPageSize(0);
            pageData.setTotalPage();
            pageData.setData(selectAll());
            return pageData;
        }
        pageData.setPageNo(pageNo);
        pageData.setPageSize(pageSize);
        pageData.setTotalPage();
        sql = "select * from worker order by id limit ?,?";
        BaseDao.setPst(sql,new Object[]{
                (pageNo-1)*pageSize,pageSize
        });
        pageData.setData(BaseDao.executeQuery());
        return pageData;
    }

    @Override
    public PageData listByPageAndSome(Object condition, Integer pageNo, Integer pageSize) {
        return null;
    }

    @Override
    public boolean resetList(List<Worker> workerList) {
        return false;
    }
}
