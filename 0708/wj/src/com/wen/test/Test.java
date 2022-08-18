package com.wen.test;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/8 9:01
 */
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("e:/Desktop/mu.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("e:/Desktop/wen1.txt"));
        String content;
        while ((content = br.readLine())!=null){
            bw.write(content);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
