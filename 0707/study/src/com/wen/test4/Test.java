package com.wen.test4;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 16:49
 */
public class Test {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:/Desktop/wen.txt"));
        osw.write("今天有点热热的");
        osw.flush();
        osw.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:/Desktop/wen.txt")));
        String content;
        while ((content= br.readLine())!=null){
            System.out.println(content);
        }
        br.close();
    }
}
