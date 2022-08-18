package com.mu.test3;

import java.io.File;

/**
 * @author :muxiaowen
 * @date : 2022/7/6 16:54
 */
public class Test4 {
    public static void main(String[] args) {
        //遍历目录下的文件
        showFile("e:/Desktop/iotest",0);
    }

    /**
     * //遍历目录下的文件
     * @param path
     */
    public static void showFile(String path,int n){
        for (int i=0;i<n;i++){
            System.out.print("     |- ");
        }
        //构建文件对象
        File file = new File(path);

        //判断文件是否存在
        if(!file.exists()){
            System.out.println("文件不存在");
            return;
        }

        //判断文件对象是一个目录还是一个数据文件
        if(file.isFile()){
            //如果是一个数据文件，则直接返回，不做遍历
            System.out.println(file.getName());
            n=0;
            return;
        }
        n++;
        System.out.println(file.getName()+" <DIR>");
        //如果是目录，则进行遍历
        File[] fs = file.listFiles();
        //遍历目录下的子级文件
        for (File f: fs){
            //进入子级目录，继续遍历它内部的文件
            showFile(f.getPath(),n);
        }

    }
}