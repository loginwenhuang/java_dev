package com.wen.test;

import com.wen.util.BaseDAO;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/23 8:56
 */
public class MyTest {
    @Test
    public void myTest1(){
        String sql = "insert into stu " +
                "   values" +
                "   (?,?,?,?)";
        Object[] params = {1002,"wen","man","2009-1-1"};

        BaseDAO.setPst(sql,params);
        int count = BaseDAO.executeUpdate();
        System.out.println(count);
    }
    @Test
    public void test2(){
        String sql = "select * from stu";
        BaseDAO.setPst(sql,null);

        List<Map<String,Object>> rows = BaseDAO.executeQuery();

        for (Map map:rows) {
            System.out.println(map);
        }
    }
}
