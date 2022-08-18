package com.wen.orm.dao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 14:59
 */
public interface IGenericDao<T> {
    /**
     * 查询全部数据
     * @param t
     * @return
     */
    List<Map<String,Object>> listAll(T t);

    /**
     * 插入数据
     * @param t
     * @return
     */
    int insert(T t);

    /**
     * 修改数据
     * @param t
     * @return
     */
    int update(T t);

    /**
     * 删除数据
     * @param t
     * @return
     */
    int delete(T t);
}
