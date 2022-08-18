package com.wen.test2;

import java.io.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/7 15:36
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Game g = new Game();
        g.setName("目一个");
        g.setLevel(7);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/Desktop/muyige.txt"));
        oos.writeObject(g);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/Desktop/muyige.txt"));
        //读取的对象数据是 Object 需要强转为Game
        Game g1= (Game)ois.readObject();
        System.out.println(g1);
        ois.close();
    }
}
