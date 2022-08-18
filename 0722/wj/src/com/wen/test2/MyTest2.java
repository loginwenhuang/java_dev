package com.wen.test2;

import java.sql.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/22 15:34
 */
public class MyTest2 {
    public static void main(String[] args){
        String Driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test_0720_1?useSSL=false&characterEnding=utf8&serverTimezone=Asia/Shanghai";
        String user = "muxiaowen";
        String password = "123456";

        Connection con = null;
        PreparedStatement pst= null;

        try {
            Class.forName(Driver);
            con = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        String sql = "update bank" +
                "   set money = money + ? " +
                "   where account = ?";
        /**
         * 使用手动事务
         * 模拟张三给李四转账
         */
        try {
            con.setAutoCommit(false);

            pst = con.prepareStatement(sql);

            pst.setInt(1,-1000);
            pst.setString(2,"张三");
            int res = pst.executeUpdate();
            System.out.println("更新记录数:"+res);
            /**
             * 模拟中途出错
             */
            int n = 1/0 ;
            pst.setInt(1,1000);
            pst.setString(2,"李四");
            res = pst.executeUpdate();
            System.out.println("更新记录数:"+res);

            //提交事务
            con.commit();
            System.out.println("事务提交成功!");
        } catch (Exception ex) {
            ex.printStackTrace();

            try {
                //回滚事务
                con.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }finally {
            try {
                pst.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
