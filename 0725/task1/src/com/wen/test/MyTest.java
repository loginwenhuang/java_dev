package com.wen.test;

import com.wen.util.BaseDAO;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Base64;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 16:51
 */
public class MyTest {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String tabName = "Orders";

        String sql = "select * from "+tabName+" where 1<>1 ";

        try{
            con = BaseDAO.getConnection();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            ResultSetMetaData metaData = rs.getMetaData();

            int colCount = metaData.getColumnCount();

            StringBuilder strJavaEntity =new StringBuilder();
            strJavaEntity.append("public class "+tabName+"{\r\n");

            for (int i=1;i<=colCount;i++){
                String colName = metaData.getColumnName(i);
                String colType = metaData.getColumnTypeName(i);
                strJavaEntity.append("\tprivate "+CodeGenUtil.getJavaType(colType)+" "+colName+";\r\n");
            }
            strJavaEntity.append("}");

            System.out.println(strJavaEntity);

            File file =new File("E:/Desktop/Java_dev/0725/task1/src/com/wen/entity");
            if(!file.exists()){
               file.mkdirs();
            }
            PrintWriter out = new PrintWriter(file.getPath()+File.separator+tabName+".java");
            out.println(strJavaEntity);
            out.flush();
            out.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            BaseDAO.closeAll(con,pst,rs);
        }
    }

}
