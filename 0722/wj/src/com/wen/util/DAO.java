package com.wen.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/22 19:41
 */
public class DAO {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bodb?useSSL=false&characterEnding=utf8&serverTimezone=Asia/Shanghai";
    private static final String USER ="root";
    private static final String PASSWORD = "123456";

    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }
    public static PreparedStatement setPst(Connection con,String sql,Object[] params){
        PreparedStatement pst = null;
        if(params==null){
            try {
                pst = con.prepareStatement(sql);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return pst;
        }
        try {
            pst = con.prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        for (int i = 1; i <= params.length; i++) {
            try {
                pst.setObject(i,params[i-1]);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return pst;
    }
    public static int executeUpdate(PreparedStatement pst){
        int count = 1;
        try {
            count = pst.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count;
    }
    public static ResultSet executeQuery(PreparedStatement pst){
        ResultSet rs = null;
        try {
            rs = pst.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rs;
    }
    public static List<Map<String,Object>> packResults(ResultSet rs){
        List<Map<String,Object>> rows = new ArrayList<>();

        try {
            ResultSetMetaData rsMd = rs.getMetaData();
            int colCount = rsMd.getColumnCount();
            while (rs.next()){
                Map<String,Object> map = new HashMap<>();
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
        return rows;
    }
    public static void closeAll(Connection con, PreparedStatement pst,ResultSet rs){
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
