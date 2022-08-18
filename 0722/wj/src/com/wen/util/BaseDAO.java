package com.wen.util;

import java.lang.reflect.Parameter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/7/22 9:38
 */
public class BaseDAO {
    /**
     * 数据库属性
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/lib?useSSL=false&characterEnding=utf8&serverTimezone=Asia/Shanghai";
    private static final String USER = "muxiaowen";
    private static final String PASSWORD = "123456";
    /**
     * 获取数据库连接
     */
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con= DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }

    /**
     * 设置预编译命令对象
     * @param con
     * @param sql
     * @param params
     * @return
     */
    public static PreparedStatement setPst(Connection con,String sql,Object[] params){
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if(params==null){
            return pst;
        }
        for (int i = 0; i < params.length; i++) {
            try {
                pst.setObject(i+1,params[i]);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return pst;
    }

    /**
     * 通用增删改
     * @return
     */
    public static int executeUpdate(PreparedStatement pst){
        int count = -1;
        try {
            count =  pst.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count;
    }
    /**
     * 通用查询
     */
    public static List<Map<String,Object>> executeQuery(PreparedStatement pst){
        List<Map<String,Object>> rows = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = pst.executeQuery();
            ResultSetMetaData rSMD = rs.getMetaData();
            int colCount = rSMD.getColumnCount();
            while (rs.next()){
                Map map = new HashMap();
                for (int i = 1; i <= colCount; i++) {
                    String colName = rSMD.getColumnName(i);
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

    /**
     * 关闭数据库对象
     * @param con
     * @param pst
     * @param rs
     */
    public static void closeAll(Connection con,PreparedStatement pst,ResultSet rs){
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
