package com.wen.test;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 20:01
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/Desktop/Java_dev/Task/一阶段人事管理项目原型");
        if(file.isDirectory()){
            System.out.println(file.getName());
            System.out.println(file.listFiles()[0].getName());
        }
    }
}
