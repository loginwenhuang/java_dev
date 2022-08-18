package com.wen.orm.dao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/12 8:30
 */
public interface IGenericDao<T> {
    List<Map<String,Object>> allList(T t);
}
