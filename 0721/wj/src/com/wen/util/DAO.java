package com.wen.util;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/22 8:24
 */
public class DAO {
    private static String url = "jdbc:mysql://localhost:3306/test_0720_1?useSSL=false&characterEncoding=utf8";
    private static String user = "root";
    private static String password="123456";

    private static Connection con =null;
    private static Statement sta = null;
    private static ResultSet rs = null;

    private static void getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(url,user,password);
            sta = con.createStatement();
            System.out.println("数据库连接成功...");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static int executeUpdate(String sql){
        int count = -1;
        getConnection();
        try {
            count = sta.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            close();
        }
        return count;
    }
    public static void executeQuery(String sql){
        getConnection();
        try {
            rs = sta.executeQuery(sql);
            while (rs.next()){
                for (int i = 1; i <= 3; i++) {
                    System.out.print(rs.getObject(i));
                }
                System.out.println();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            close();
        }
    }
    private static void close(){
        try{
            if(rs!=null){
                rs.close();
            }
            if(sta!=null){
                sta.close();
            }
            if(con!=null){
                con.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
