package com.wen.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 9:00
 */
public class BaseDao {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/test_0801?useSSL=false&characterEncoding=utf8&serverTimezone=Asia/Shanghai";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    private static Connection con = null;
    private static PreparedStatement pst = null;
    private static ResultSet rs = null;

    private static void getConnection(){
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void setPst(String sql,Object[] params){
        getConnection();
        if(params==null){
            try {
                pst = con.prepareStatement(sql);
                return;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        try {
            pst = con.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pst.setObject(i+1,params[i]);
            }
            System.out.println(pst);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static int executeUpdate(){
        int count = -1;
        try {
            count = pst.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        closeAll();
        return count;
    }

    public static List<Map<String,Object>> executeQuery(){
        try {
            rs = pst.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        List<Map<String,Object>> rows = new ArrayList<>();
        try {
            ResultSetMetaData rsMd = rs.getMetaData();
            int colCount = rsMd.getColumnCount();
            while (rs.next()){
                Map map = new HashMap(16);
                for (int i = 1; i <= colCount; i++) {
                    String colName = rsMd.getColumnLabel(i);
                    Object colVal = rs.getObject(i);
                    map.put(colName,colVal);
                }
                rows.add(map);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        closeAll();
        return rows;
    }
    private static void closeAll(){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(pst!=null){
            try {
                pst.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(con!=null){
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
