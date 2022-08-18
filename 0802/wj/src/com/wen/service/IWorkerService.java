package com.wen.service;

import com.wen.entity.PageData;
import com.wen.entity.Worker;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/2 9:13
 */
public interface IWorkerService {
    List<Worker> selectAll();
    Worker selectById(Integer id);
    boolean insert(Worker worker);
    boolean delete(Integer id);
    boolean update(Worker woreker);
    List<Worker> search(String condition);
    PageData listByPage(Integer pageNo,Integer pageSize);
    PageData listByPageAndSome(String condition,Integer pageNo,Integer pageSize);

    /**
     * 重置
     * @return
     */
    boolean resetList();
}
