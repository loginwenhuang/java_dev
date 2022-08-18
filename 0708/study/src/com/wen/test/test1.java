package com.wen.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @author :muxiaowen
 * @date : 2022/7/8 10:31
 */
public class test1 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("wen");
        col.add(12);
        col.add(1.87);
        col.add(true);
        System.out.println(col);
        for (Object obj: col) {
            System.out.println(obj);
        }
        col.remove(12);
        System.out.println(col);
    }
}
