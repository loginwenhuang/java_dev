package com.wen.test2;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/8 14:49
 */
public class Test {
    public static void main(String[] args){
        String srcPath = "e:/Desktop/wen.txt";
        String destPath = "e:/Desktop/mu.txt";

        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(srcPath);
            os = new FileOutputStream(destPath);

            byte[] bs = new byte[1024];
            int count = -1;
            while (true){
                count = is.read(bs);
                if(count == -1){
                    break;
                }
                os.write(bs,0,count);
            }
        }catch (FileNotFoundException ex){
            //文件不存在异常
            ex.printStackTrace();
        }catch (IOException ex){
            //输入输出异常(读写文件异常)
            ex.printStackTrace();
        }finally {
            //确保流关闭的操作执行
            if(os!=null){
                try {
                    os.close();
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }
            if(is!=null){
                try{
                    is.close();
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }

    }
}
