package com.wen.test;

import com.wen.util.BaseDAO;
import com.wen.util.ConGenUtil;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/26 8:28
 */
public class MyTest2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String tableName = "Orders";

        String sql = "select * from "+tableName+" where 1<>1";

        try {
            con = BaseDAO.getConnection();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();

            int colCount = rsMd.getColumnCount();

            StringBuilder strJavaEntity = new StringBuilder();

            strJavaEntity.append("public class"+tableName+"{\r\n");

            for (int i = 1; i <= colCount; i++) {
                String colName = rsMd.getColumnLabel(i);
                String colType = rsMd.getColumnTypeName(i);

                strJavaEntity.append("\tprivate "+ ConGenUtil.getJavaType(colType)+" "+colName+";\r\n");
            }
            strJavaEntity.append("}");

            PrintWriter pw = new PrintWriter("E:/Desktop"+tableName+".java");
            pw.println(strJavaEntity);
            pw.flush();
            pw.close();
            System.out.println(strJavaEntity);
        } catch (SQLException | FileNotFoundException throwables) {
            throwables.printStackTrace();
        }finally{
            BaseDAO.closeAll(con,pst,rs);
        }
    }
}
