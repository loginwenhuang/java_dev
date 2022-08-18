package com.wen.test;

import com.wen.orm.dao.IGenericDao;
import com.wen.orm.dao.impl.GenericDaoImpl;
import com.wen.orm.entity.Student;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/12 8:53
 */
public class Test {
    public static void main(String[] args) {
        IGenericDao genericDao = new GenericDaoImpl();
        List list = genericDao.allList(new Student());
        for (Object o:list) {
            System.out.println(o);
        }
    }
}
