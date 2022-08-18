package com.mu.test3;

import java.io.File;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/7/6 10:22
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //文件对象:数据文件，目录文件
        //File file0 = new File("E:/Desktop/mu.txt");
        //File.separator:路径分隔符 (根据操作系统改变)
        File file0 = new File("E:"+File.separator+"Desktop"+File.separator+"mu.txt");
        //判断文件是否存在
        if(!file0.exists()){
            //在该目录下创建文件，如果目录不正确会报错(IOException: 系统找不到指定的路径。)
            file0.createNewFile();
        }else{
            //删除文件
            //file0.delete();
        }
        //文件大小,
        System.out.println(file0.length());
        //是否为目录文件
        System.out.println(file0.isDirectory());
        //是否是数据文件
        System.out.println(file0.isFile());
        //文件名
        System.out.println(file0.getName());
        //文件路径
        System.out.println(file0.getPath());

        //文件属性：是否 可读、可写、可执行
        System.out.println(file0.canRead());
        System.out.println(file0.canWrite());
        System.out.println(file0.canExecute());



    }
}
