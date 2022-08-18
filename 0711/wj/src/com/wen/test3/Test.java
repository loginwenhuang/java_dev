package com.wen.test3;

import javafx.print.Collation;

import java.util.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 14:54
 */
public class Test {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("c");
        set.add("d");
        set.add("a");
        set.add("a");
        set.add(10);
        set.add(9);
        System.out.println(set);


        Collection<String> collection = new HashSet<>();
        collection.add("a");
        collection.add("b");
        collection.add("a");
        collection.add("q");
        collection.add("g");

        Iterator it = collection.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
