package com.wen.test1;

import com.wen.util.DataDAO;
import org.junit.Test;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/22 8:17
 */
public class MyTest {
    @Test
    public void myTest1(){
        String sql = "insert into bank" +
                "(account,money)" +
                "value" +
                "('温',1000)";
        DataDAO.executeUpdate(sql);
    }
    @Test
    public void myTest(){
        String sql = "update bank " +
                "set account = '目',money = 3000 " +
                "where bid = 5";
        DataDAO.executeUpdate(sql);
    }
    @Test
    public void myTest2(){
        String sql = "select bid,account,money " +
                "from bank " +
                "where account = '温'";
        System.out.println(sql);
        DataDAO.executeQuery(sql);
    }
    @Test
    public void myTest4(){
        String sql = "delete from bank " +
                "order by money " +
                "limit 1";
        System.out.println(sql);
        DataDAO.executeUpdate(sql);
    }

    @Test
    public void MyTest5(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入sql语句/n退出");
            String sql = scanner.nextLine();
            scanner.close();
            System.out.println(sql);
            if(sql.charAt(0)=='s'||sql.charAt(0)=='S'){
                DataDAO.executeQuery(sql);
            }else{
                DataDAO.executeUpdate(sql);
            }
        }
    }
    @Test
    public void MyTest6(){
        Scanner scanner = new Scanner(System.in);
        String sql = null;
        while (true){
            System.out.println("请输入sql语句(以;为结束)/n退出");
            sql = scanner.next();
            if("n".equals(sql)){
                break;
            }else {
                while(true){
                    if(";".equals(sql.substring(sql.length()-1))){
                        break;
                    }else {
                        sql += " "+scanner.next();
                    }
                }

                System.out.println(sql);
                if(sql.charAt(0)=='s'||sql.charAt(0)=='S'){
                    DataDAO.executeQuery(sql);
                }else{
                    DataDAO.executeUpdate(sql);
                }
            }
        }
        scanner.close();
    }
}
