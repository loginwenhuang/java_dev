package com.wen.test3;

import java.util.LinkedList;
import java.util.Vector;

/**
 * @author :muxiaowen
 * @date : 2022/7/8 16:18
 */
public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("aaa");
        list.add("bbb");
        list.add(true);
        list.add(100);
        list.add(200);
        System.out.println(list);
        list.addFirst("wen");
        list.addLast("mu");
        list.add("xiao");
        System.out.println(list);

        list.add(3,"ccc");
        System.out.println(list);
        list.removeLast();
        list.removeFirst();
        System.out.println(list.size());

        Vector vector = new Vector();
        vector.add("sdfs");
        vector.add("qqq");
        System.out.println(vector.get(1));

        System.out.println(vector);
    }
}
