package com.wen.dao.impl;

import com.mysql.cj.util.StringUtils;
import com.wen.dao.IWorkerDao;
import com.wen.entity.PageData;
import com.wen.entity.Worker;
import com.wen.util.BaseDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/3 8:25
 */
public class WorkerDaoImpl implements IWorkerDao {
    private static int flag = 1;
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
        flag = n;
        if(StringUtils.isNullOrEmpty((String) condition)){
            return selectAll();
        }
        List<Object> params = new ArrayList<>();
        params.add("%"+condition+"%");
        String sql = "select * from worker";
        switch (flag){
            case 1:
                sql = "select * from worker where id like ?";
                break;
            case 2:
                sql = "select from worker where name like ?";
                break;
            default:
                break;
        }
        BaseDao.setPst(sql,params.toArray());
        List<Map<String,Object>> rows = BaseDao.executeQuery();
        List<Worker> workerList = new ArrayList<>();
        if(rows.size()>0){
            for (Map map:rows) {
                Worker worker = new Worker(
                        (Integer) map.get("id"),
                        (String) map.get("name"),
                        (String) map.get("info")
                );
                workerList.add(worker);
            }
            return workerList;
        }else {
            if(flag!=2){
                return selectSome(condition,n+1);
            }
        }
        return null;
    }

    @Override
    public PageData listByPage(Integer pageNo, Integer pageSize) {
        PageData pageData = new PageData();
        String sql = "select count(id) from worker";
        BaseDao.setPst(sql,null);
        pageData.setTotalCount(BaseDao.getTotal());
        if(pageData.getTotalCount()==0){
            pageData.setPageNo(1);
            pageData.setPageSize(0);
            pageData.setData(selectAll());
            pageData.setTotalPage();
            return pageData;
        }
        pageData.setPageNo(pageNo);
        pageData.setPageSize(pageSize);
        pageData.setTotalPage();
        sql = "select * from worker order by id limit ?,?";
        BaseDao.setPst(sql,new Object[]{
                (pageNo-1)*pageSize,pageSize
        });
        pageData.setData(BaseDao.executeUpdate());
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
