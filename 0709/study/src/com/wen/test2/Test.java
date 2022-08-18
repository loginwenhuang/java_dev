package com.wen.test2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 8:13
 */
public class Test {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("aaa");
        set.add("bbb");
        set.add("bbb");
        set.add(true);

        set.add(new Student("小成",18));

        System.out.println(set.size());
        System.out.println(set);

        System.out.println(set.contains(new Student("小成",18)));

        System.out.println(set.isEmpty());

        for (Object obj:set) {
            System.out.println(obj);
        }

        Iterator it = set.iterator();
        while (it.hasNext()){
            if(it.next()!=null){
                it.remove();
            }
        }
        System.out.println(set);
    }


}
