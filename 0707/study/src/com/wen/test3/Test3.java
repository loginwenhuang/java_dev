package com.wen.test3;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 16:28
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("e:/Desktop/wen.txt"));
        bw.write("万事无如退步人，\n孤云野鹤自由身。");
        //换行
        bw.newLine();
        bw.write("松风十里时来往，\n笑揖峰头月一轮。");
        bw.flush();
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("e:/Desktop/wen.txt"));
        String res;
        while ((res=br.readLine())!=null){
            System.out.println(res);
        }
        br.close();
    }
}
