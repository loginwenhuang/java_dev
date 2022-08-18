package com.wen.test1;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 14:52
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("e:/Desktop/mu.txt",true));//true:追加的方式写入
        String s = "\n笑揖峰头月一轮";
        bos.write(s.getBytes());

        //清空缓冲区，关闭流
        bos.flush();
        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("e:/Desktop/mu.txt"));
        byte[] b = new byte[1024];
        bis.read(b);
        System.out.println(new String(b));

        bis.close();
    }
}
