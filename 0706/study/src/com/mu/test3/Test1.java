package com.mu.test3;

import java.io.File;

/**
 * @author :muxiaowen
 * @date : 2022/7/6 10:42
 */
public class Test1 {
    public static void traverseFile(File file,int n){
        for (int i=0;i<n;i++){
            System.out.print("     |- ");
        }
        if(!file.isDirectory()){
            System.out.println(file.getName()+" ");
        }else{
            n++;
            System.out.println(file.getName()+"<DIR>");
            File[] fs = file.listFiles();
            for (File f : fs){
                File file1 = new File(f.getPath());
                traverseFile(file1,n);
            }
        }
    }
    public static void main(String[] args) {
        File file  = new File("E:/Desktop/iotest");
        traverseFile(file,0);
    }
}
