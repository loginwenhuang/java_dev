package com.mu.test4;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/6 11:51
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/Desktop/mu.txt");
        OutputStream in = new FileOutputStream(file,true);
        String content = "Hello world!\n世界，你好！\n";
        in.write(content.getBytes());

        InputStream is = new FileInputStream(file);
        byte[] bt = new byte[1024];
        int count = is.read(bt);
        String s = new String(bt,0,count);
        System.out.println(s);

    }

}

