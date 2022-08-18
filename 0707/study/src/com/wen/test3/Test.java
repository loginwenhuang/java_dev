package com.wen.test3;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 11:17
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("e:/Desktop/wen.txt");
        writer.write("笑揖峰头月一轮".toCharArray());
        writer.close();

        Reader reader = new FileReader("e:/Desktop/wen.txt");
        char[] c = new char[1024];
        reader.read(c);
        System.out.println(c);
        reader.close();
    }
}
