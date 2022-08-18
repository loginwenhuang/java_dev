package com.wen.service;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/5 20:58
 */
public interface IClassService {
    /**
     * 所有的班级
     * @return
     */
    List<Map<String,Object>> classList();

    /**
     * 通过班级名称找班级
     * @param className
     * @return
     */
    List<Map<String,Object>> selectClassByClassName(String className);
}
