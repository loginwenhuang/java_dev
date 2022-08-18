package com.wen.test;

import java.sql.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/21 9:55
 */
public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        test();
    }

    /**
     * java连接数据库
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static void test() throws ClassNotFoundException, SQLException {
        //数据库驱动接口，可以创建数据库连接
        //Driver driver = null;

        //数据库连接接口，用于跟数据库之间搭建桥梁，并能创建命令执行的对象
        Connection con = null;

        //sql命令执行接口，用于执行增删改查语句，执行查询时会返回结果集对象
        Statement statement = null;

        //结果集接口，用于读取查询结果
        ResultSet r = null;

        /**
         * 数据库连接属性
         * url:数据库地址
         * useSSL:是否加密传输
         * characterEncoding:字符编码
         * serverTimezone:时区
         */
        String url = "jdbc:mysql://127.0.0.1:3306/test_0720_1?useSSL=false&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";

        //user:数据库用户名
        String user = "muxiaowen";
        //password:数据库密码
        String password = "123456";

        /**
         * 使用Java的驱动管理类加载数据库驱动，从而获取连接对象
         * 使用反射的方式，将驱动类加载到jvm中
         */
        Class.forName("com.mysql.cj.jdbc.Driver");

        //使用数据库驱动管理类，获取连接对象
        con = DriverManager.getConnection(url,user,password);

        //查询数据
        String sql = "select * from bank";

        //通过连接对象创建命令执行对象
        statement = con.createStatement();

        //查询数据并接收返回的结果集对象
        r = statement.executeQuery(sql);

        /**
         * 使用结果集对象读取查询结果
         * next():是否有下一条数据(true/false)
         */
        while(r.next()){
            System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt("money"));
        }

        //插入数据
         sql = "insert into bank value (4,'赵六',6000)";

        //返回的是数据库受影响的数据条数
         int count = statement.executeUpdate(sql);
         System.out.println(count);

         //删除数据
        sql = "delete from bank where bid = 4";
        count = statement.executeUpdate(sql);
        System.out.println(count);

        //关闭数据库连接(后开先关),释放资源
        r.close();
        statement.close();
        con.close();
    }
}
