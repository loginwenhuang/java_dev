package com.wen.dao;

import com.wen.entity.PageData;
import com.wen.entity.Worker;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/2 9:03
 */
public interface IWorkerDao {
    List<Worker> selectAll();
    Worker selectById(Integer id);
    int insert(Worker worker);
    int delete(Integer id);
    int update(Worker woreker);

    /**
     * 条件查询
     * @param condition
     * @param flag
     * @return
     */
    List<Worker> selectSome(Object condition,int n);

    /**
     * 分页
     * @param pageNo
     * @param pageSize
     * @return
     */
    PageData listByPage(Integer pageNo,Integer pageSize);

    /**
     * 搜索的分页
     * @param condition
     * @param pageNo
     * @param pageSize
     * @return
     */
    PageData listByPageAndSome(Object condition,Integer pageNo,Integer pageSize);

    /**
     * 重置一下表格的数据的id
     * @param workerList
     * @return
     */
    boolean resetList(List<Worker> workerList);
}
