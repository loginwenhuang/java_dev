package com.wen.test;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 8:55
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("e:/Desktop/mu.txt");
        //file.createNewFile();
        OutputStream os = new FileOutputStream(file);
        String s = "Hello World";
        byte[] b = new byte[1024];

        os.write(s.getBytes());
        os.close();

        InputStream is = new FileInputStream(file);
        int count = is.read(b);
        String res = new String(b,0,count);
        System.out.println(res);
        is.close();
    }
}
