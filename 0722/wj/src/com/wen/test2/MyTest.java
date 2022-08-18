package com.wen.test2;

import java.sql.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/22 15:00
 */
public class MyTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String Driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/lib?useSSL=false&characterEnding=utf8&serverTimezone=Asia/Shanghai";
        String user = "muxiaowen";
        String password = "123456";

        Connection con = null;
        PreparedStatement pst= null;

        Class.forName(Driver);
        con = DriverManager.getConnection(url,user,password);

        String name = "羽";
        String author ="五";
        int price = 21;
        String pucDate = "2013-3-3";
        String sql = "insert into book(name,author,price,pucdate) " +
                "value " +
                "(?,?,?,?)";

        /**
         * pst = con.prepareStatement(sql);
         * 创建预编译命令对象时，要提供获取自增值的参数
         */
        pst = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        pst.setObject(1,name);
        pst.setString(2,author);
        pst.setInt(3,price);
        pst.setDate(4, Date.valueOf(pucDate));
        //pst.setObject(5,"wen");#没有第5个? 会直接报错

        /**
         * 直接打印pst 显示最终的sql语句
         */
        System.out.println(pst);

        /**
         * 执行sql语句插入一条数据
         */
        int count = pst.executeUpdate();
        System.out.println("受影响的数据条数："+count);

        /**
         * 获取自增返回的结果集对象
         */
        ResultSet rs = null;
        rs = pst.getGeneratedKeys();
        if(rs.next()){
            int id = rs.getInt(1);
            System.out.println("自增值:"+id);
        }

        rs.close();
        pst.close();
        con.close();
    }
}
