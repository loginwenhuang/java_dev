package com.yzh.test03;

import com.yzh.test03.ali.FaceRec;

/**
 * @author wen
 */
public class Test {
    public static void main(String[] args) {
        FaceRec fac1 = new FaceRec();
        com.yzh.test03.baidu.FaceRec fac2 = new com.yzh.test03.baidu.FaceRec();

        fac1.reputation();
        fac2.reputation();

        Myclass myclass =new Myclass();
        myclass.age = 1;
        //myclass.num =10;
        myclass.sum = 10;
        myclass.tall = 2.0;
    }
}
