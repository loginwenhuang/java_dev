package com.wen.service.impl;

import com.wen.dao.IClassDao;
import com.wen.dao.impl.ClassDaoImpl;
import com.wen.service.IClassService;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/5 20:58
 */
public class ClassServiceImpl implements IClassService {
    IClassDao classDaoImpl = new ClassDaoImpl();
    @Override
    public List<Map<String, Object>> classList() {
        return classDaoImpl.allClass();
    }

    @Override
    public List<Map<String, Object>> selectClassByClassName(String className) {
        return null;
    }
}
