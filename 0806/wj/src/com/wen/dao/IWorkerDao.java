package com.wen.dao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/6 9:06
 */
public interface IWorkerDao {
    List<Map<String,Object>> selectAllWorker();
}
