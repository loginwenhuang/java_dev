package com.wen.orm;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/12 9:07
 */
public interface IGenericDao<T> {
    List<Map<String,Object>> allList(T t);
}
