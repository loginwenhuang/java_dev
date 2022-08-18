package com.wen.test;

import com.wen.entity.Student;
import com.wen.orm.IGenericDao;
import com.wen.orm.impl.GenericDaoImpl;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/12 9:12
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
