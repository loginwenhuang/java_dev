package com.wen.util;

import java.sql.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/21 16:36
 */
public class DataDAO {
    final static String url="jdbc:mysql://localhost:3306/test_0720_1?useSSL=false&characterEncoding=utf8&serverTimezone=Asia/Shanghai";
    final static String user ="muxiaowen";
    final static String password ="123456";

    private static Connection con =null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;

    private static void  getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            con = DriverManager.getConnection(url,user,password);
            statement = con.createStatement();
            System.out.println("数据库已连接...");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static int executeUpdate(String sql){
        getConnection();
        int count = -1;
        try {
            count =  statement.executeUpdate(sql);
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
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                for (int i = 1; i <= 3; i++) {
                    System.out.print(resultSet.getObject(i)+"  ");
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
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(con!=null){
            try {
                con.close();
                System.out.println("数据库已关闭");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
