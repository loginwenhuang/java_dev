package com.wen.test1;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 15:02
 */
public class Test2 {
    public void copyFile(String srcPath,String destPath) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcPath));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath));
        byte[] b = new byte[1024];

        while (bis.read(b)!=-1){
            bos.write(b);
        }
        bos.flush();
        bos.close();
        bis.close();
    }
    public static void main(String[] args) throws IOException {
        Test2 test2 = new Test2();
        test2.copyFile("e:/Desktop/ren.png","e:/Desktop/mu.png");
    }
}
