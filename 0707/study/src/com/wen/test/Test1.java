package com.wen.test;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 14:05
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("e:/Desktop/mu.txt");
        if(file.exists()){
            file.delete();
        }

        String s = "Hello World";
        OutputStream os = new FileOutputStream(file);

        os.write(s.getBytes());
        os.flush();
        os.close();

        InputStream is = new FileInputStream(file);
        byte[] b = new byte[1024];
        int count = is.read(b);
        //String s1 = new String(b,0,count);
        String s1 = new String(b);
        System.out.println(s1);
        is.close();
    }
}
