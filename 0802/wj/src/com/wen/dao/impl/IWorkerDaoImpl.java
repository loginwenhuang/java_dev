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
 * @date : 2022/8/2 9:05
 */
public class IWorkerDaoImpl implements IWorkerDao {
    private int flag = 1;
    List<Map<String,Object>> rows = null;
    @Override
    public List<Worker> selectAll() {
        String sql = "select * from worker";
        BaseDao.setPst(sql,null);
        List<Map<String,Object>> rows = BaseDao.executeQuery();
        List<Worker> workerList = new ArrayList<>();
        if(rows.size()>0){
            for (Map map:rows) {
                Worker w = new Worker(
                        (Integer) map.get("id"),
                        (String) map.get("name"),
                        (String)map.get("info")
                );
                workerList.add(w);
            }
        }
        return workerList;
    }

    @Override
    public Worker selectById(Integer id) {
        String sql = "select * from worker where id = ?";
        BaseDao.setPst(sql,new Object[]{id});
        rows = BaseDao.executeQuery();
        if(rows.size()>0){
            Map map = rows.get(0);
            Worker w = new Worker(
                    (Integer) map.get("id"),
                    (String) map.get("name"),
                    (String)map.get("info")
            );
            return w;
            }
        return null;
    }

    @Override
    public int insert(Worker worker) {
        String sql = "insert into worker(name,info)" +
                "   value" +
                "   (?,?)";
        BaseDao.setPst(sql,new Object[]{
                worker.getName(),
                worker.getInfo()
        });
        return BaseDao.executeUpdate();
    }

    @Override
    public int delete(Integer id) {
        String sql = "delete from worker where id =?";
        BaseDao.setPst(sql,new Object[]{id});
        return BaseDao.executeUpdate();
    }

    @Override
    public int update(Worker woreker) {
        String sql = "update worker " +
                "   set name = ?," +
                "       info = ?" +
                "   where id = ?";
        BaseDao.setPst(sql,new Object[]{
                woreker.getName(),
                woreker.getInfo(),
                woreker.getId()
        });
        return BaseDao.executeUpdate();
    }

    @Override
    public List<Worker> selectSome(Object condition,int n) {
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
                sql = "select * from worker where name like ?";
                break;
            default:
                break;
        }
        BaseDao.setPst(sql,params.toArray());
        rows = BaseDao.executeQuery();
        List<Worker> workerList = new ArrayList<>();
        if(rows.size()>0){
            for (Map map:rows) {
                Worker w = new Worker(
                        (Integer) map.get("id"),
                        (String) map.get("name"),
                        (String)map.get("info")
                );
                workerList.add(w);
            }
            return workerList;
        }else {
            if(flag!=2){
                return selectSome(condition,2);
            }
        }
        return null;
    }

    @Override
    public PageData listByPage(Integer pageNo, Integer pageSize) {
        PageData pageData = new PageData();

        String sql = "select count(*) from worker";
        BaseDao.setPst(sql,null);
        pageData.setTotalCount(BaseDao.getTotal());
        if(pageData.getTotalCount()<=(pageNo-1)*pageSize){
            pageNo = 1;
        }
        if(pageSize>pageData.getTotalCount()){
            pageSize=pageData.getTotalCount();
        }
        if(pageSize<=0){
            pageSize= 3;
        }
        System.out.println(pageNo);
        System.out.println(pageSize);
        pageData.setPageNo(pageNo);
        pageData.setPageSize(pageSize);

        sql = "select * from worker " +
                "   order by id" +
                "   limit ?,?";
        BaseDao.setPst(sql,new Object[]{
                (pageNo-1)*pageSize,pageSize
        });
        pageData.setData(BaseDao.executeQuery());

        pageData.setTotalPage();
        return pageData;
    }

    @Override
    public PageData listByPageAndSome(Object condition,Integer pageNo, Integer pageSize) {
        if(StringUtils.isNullOrEmpty((String) condition)){
            return listByPage(pageNo,pageSize);
        }
        PageData pageData = new PageData();
        List<Worker> workers = selectSome(condition,1);
        if(workers==null){
            pageData.setTotalCount(0);
            pageData.setPageNo(1);
            pageData.setPageSize(3);
            pageData.setData(null);
            pageData.setTotalPage();
            return pageData;
        }
        pageData.setTotalCount(workers.size());
        if(pageData.getTotalCount()==0){
            pageSize = 0;
        }
        if(pageData.getTotalCount()<=(pageNo-1)*pageSize){
            pageNo = 1;
        }
        if(pageSize>pageData.getTotalCount()){
            pageSize=pageData.getTotalCount();
        }
        if(pageSize<0){
            pageSize= 3;
        }
        System.out.println(pageNo);
        System.out.println(pageSize);
        pageData.setPageNo(pageNo);
        pageData.setPageSize(pageSize);

        List<Object> params = new ArrayList<>();
        params.add("%"+condition+"%");
        params.add((pageNo-1)*pageSize);
        params.add(pageSize);
        String sql = "select * from worker";
        switch (flag){
            case 1:
                sql = "select * from worker where id like ?  order by id limit ?,?";
                break;
            case 2:
                sql = "select * from worker where name like ? order by id limit ?,?";
                break;
            default:
                break;
        }
        BaseDao.setPst(sql,params.toArray());

        pageData.setData(BaseDao.executeQuery());

        pageData.setTotalPage();

        return pageData;
    }

    @Override
    public boolean resetList(List<Worker> workerList) {
        String sql = "truncate worker";
        BaseDao.setPst(sql,null);
        BaseDao.executeUpdate();
        if(workerList.size()>0){
            for (Worker worker:workerList) {
                insert(worker);
            }
            return true;
        }
        return false;
    }

}
