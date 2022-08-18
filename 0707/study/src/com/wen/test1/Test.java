package com.wen.test1;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 10:11
 */
public class Test {
    public void copyFile(String srcPath,String targetPath) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcPath));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetPath));
        byte[] b = new byte[1024];

        while(true){
            int count = bis.read(b);
            if(count==-1){
                break;
            }
            bos.write(b,0,count);
        }
        bos.flush();
        bos.close();;
        bis.close();
    }
    public static void main(String[] args) throws IOException {
        Test test = new Test();
        test.copyFile("e:/Desktop/ren.png","e:/Desktop/test1/");
    }
}
