package com.wen.test4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 16:10
 */
public class Test2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");

        for (String s:set) {
            System.out.println(s);
        }

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
