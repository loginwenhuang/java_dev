package com.mu.test3;

import java.io.File;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/7/6 16:07
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        File f = new File("e:/qqq/iii/ppp");
        File f2 = new File("e:/qqq/iii/ppp/xxx.txt");

        if(!f.exists()){
            //创建多级目录
            f.mkdirs();
            //创建文件
            f2.createNewFile();
        }else {
            //删除文件

            f2.delete();

            f.delete();
        }
    }
}
