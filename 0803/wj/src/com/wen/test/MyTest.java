package com.wen.test;

import com.wen.util.BaseDao;

/**
 * @author :muxiaowen
 * @date : 2022/8/3 19:50
 */
public class MyTest{
    public static void main(String[] args) {
        String sql ="select * from book";
        BaseDao.setPst(sql,null);
        System.out.println(BaseDao.executeQuery());
    }
}
