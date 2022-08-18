package com.wen.task2;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 20:53
 */
public class Task {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("E:/Desktop/mu.txt");
        Writer writer = new FileWriter("");
        BufferedReader br = new BufferedReader(new FileReader(""));
        BufferedWriter bw = new BufferedWriter(new FileWriter(""));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(""));
        BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("")));

        char[] c = new char[1024];
        int count = reader.read(c);
        System.out.println(new String(c));
        reader.close();

        writer.write(c);

        writer.flush();

        br.readLine();
        bw.write(c);
        bw.newLine();

        osw.write(c);

        r.readLine();

    }
}
