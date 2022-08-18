package com.wen.task;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 19:57
 */
public class Task {
    public static void copyFiles(String srcPath,String destPath) throws IOException {

        File f1 = new File(srcPath);
        File f2 = new File(destPath);
        if(!f1.exists()){
            return;
        }
        if(f1.isDirectory()){
            f2= new File(f2.getPath()+File.separator+f1.getName());
            f2.mkdirs();
        }
        if(f1.isFile()){
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(srcPath)));
            OutputStreamWriter isr = new OutputStreamWriter(new FileOutputStream(destPath+File.separator+f1.getName()));
            String content;
            while((content=br.readLine())!=null){
                isr.write(content);
                //System.out.println(content);
            }
            isr.flush();
            isr.close();
            br.close();
            return;
        }
        File[] fs = f1.listFiles();
        for (File f:fs) {
            copyFiles(f.getPath(),f2.getPath());
        }
}
    public static void main(String[] args) throws IOException {
        copyFiles("e:/Desktop/HTML","e:/Desktop/test2");
    }
}
