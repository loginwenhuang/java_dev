package com.wen.test3;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 11:30
 */
public class Test1 {
    public static void write() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("e:/Desktop/wen.txt"));
        bw.write("万事无如退步人，\n孤云野鹤自由身。");
        bw.newLine();
        bw.write("松风十里时来往，\n笑揖峰头月一轮。");
        bw.flush();
        bw.close();
    }
    public static void read() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("e:/Desktop/wen.txt"));

        System.out.println(br.readLine());
        while (true){
            String s = br.readLine();
            if (s==null){
                break;
            }
            System.out.println(s);
        }
        br.close();
    }
    public static void main(String[] args) throws IOException {
        write();
        read();
    }
}
