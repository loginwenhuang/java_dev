package com.wen.tes1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 10:11
 */
public class Test {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add("bc");
        set.add("ac");
        set.add("ab");

        Iterator it =set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
