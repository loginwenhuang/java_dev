package com.wen.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 9:00
 */
public class BaseDao {
    private static DataSource dataSource;
    static {
        try {
            InputStream  is= BaseDao.class.getClassLoader().getResourceAsStream("db.properties");
            Properties properties = new Properties();
            properties.load(is);
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static Connection con = null;
    private static PreparedStatement pst = null;
    private static ResultSet rs = null;

    private static void getConnection(){

        try {
            con = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public static void setPst(String sql,Object[] params){
        getConnection();
        if(params==null){
            try {
                pst = con.prepareStatement(sql);
                System.out.println(pst);
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
    public static int getTotal(){
        int count = 0;
        try {
            rs = pst.executeQuery();
            if(rs.next()){
                count = rs.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        closeAll();
        return count;
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
