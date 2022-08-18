package com.wen.test3;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 16:17
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("e:/Desktop/wen.txt");
        char[] b = "目小小小小小小小小小小小小小小小小小温".toCharArray();
        //writer.write("目小小小小小小小小小小小小小小小小小温");
        writer.write(b);

        writer.flush();
        writer.close();

        Reader reader = new FileReader("e:/Desktop/wen.txt");
        char[] cs = new char[1024];
        int count =reader.read(cs);

        System.out.println("读到的个数:"+count+"  "+new String(cs));
        reader.close();

    }
}
