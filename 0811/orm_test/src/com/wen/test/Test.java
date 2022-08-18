package com.wen.test;

import com.wen.entity.Score;
import com.wen.entity.Student;
import com.wen.orm.dao.IGenericDao;
import com.wen.orm.dao.impl.GenericDaoImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 15:16
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        IGenericDao genericDao = new GenericDaoImpl();
        Student student = new Student();
        Score score = new Score(8,3,98.0);

        student.setS_id(15);
        student.setS_name("小温");
        student.setS_birth(new SimpleDateFormat("yyyy-MM-dd").parse("2008-1-1"));
        student.setS_sex("男");


       //genericDao.insert(student);
        //genericDao.insert(score);
        //genericDao.update(student);
        genericDao.delete(student);

        //genericDao.delete(score);

        System.out.println("======================");
        List<Map<String, Object>> list = genericDao.listAll(student);
        for (Map map:list) {
            System.out.println(map);
        }
    }
}
