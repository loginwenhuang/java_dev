package com.wen.test4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 16:57
 */
public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("e:/Desktop/wen.txt");
        pw.println("万事无如退步人,");
        pw.println("孤云野鹤自由身。");
        pw.println("松风十里时来往,");
        pw.println("笑揖峰头月一轮。");
        String name = "目小温";
        String sex = "男";
        double tall = 1.82;
        //格式化输出： %s 字符串;%d 整数;%f 小数
        pw.printf("姓名：%s 性别：%s 身高：%.2f",name,sex,tall);
        pw.flush();
        pw.close();
    }
}
