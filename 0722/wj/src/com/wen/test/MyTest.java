package com.wen.test;

import com.wen.util.BaseDAO;
import com.wen.util.DAO;
import org.junit.Test;

import javax.swing.plaf.basic.BasicSeparatorUI;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/22 9:36
 */
public class MyTest {
    @Test
    public void MyTest1(){
        String name = "羽";
        String auther ="五";
        int price = 21;
        String pucdate = "2013-3-3";
        Object[] params = {name,auther,price,pucdate};
        String sql = "insert into book(name,author,price,pucdate) " +
                "value " +
                "(?,?,?,?)";

        Connection con = BaseDAO.getConnection();
        PreparedStatement pst = BaseDAO.setPst(con,sql,params);

        System.out.println(BaseDAO.executeUpdate(pst));

        params = new Object[]{"羽"};
        String id = "id";
        sql = "select "+id+",name,author,price,pucdate " +
                "   from book" +
                "   where name = ? ";
        pst = BaseDAO.setPst(con,sql,params);

        List<Map<String,Object>> list = BaseDAO.executeQuery(pst);

        for (Map map:list) {
            System.out.println(map);
        }
    }
    @Test
    public void MyTest2(){
        String sql = "select * from orders";
        Connection con = DAO.getConnection();
        PreparedStatement pst = DAO.setPst(con,sql,null);
        ResultSet rs = DAO.executeQuery(pst);

        List<Map<String,Object>> rows = DAO.packResults(rs);
        for (Map map: rows) {
            System.out.println(map);
        }
        DAO.closeAll(con,pst,rs);
    }
    @Test
    public void MyTest3() throws SQLException {
        Connection con = BaseDAO.getConnection();
        String sql = "";
        Object[] params = {};
        PreparedStatement pst = BaseDAO.setPst(con,sql,params);
    }
}
