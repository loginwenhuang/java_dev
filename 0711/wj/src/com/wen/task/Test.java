package com.wen.task;

import java.util.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 16:40
 */
public class Test {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("小张",16));
        list.add(new Person("小王",17));
        list.add(new Person("小温",18));
        list.add(new Person("小成",19));
        list.add(new Person("小张",16));
        System.out.println(list);

        Set<Person> set = new HashSet<>();
        Iterator<Person> it1 = list.iterator();
        while(it1.hasNext()){
            set.add(it1.next());
        }
        System.out.println(set);

        Map<String,Person> map = new HashMap<>();
        Iterator<Person> it2 = set.iterator();
        while (it2.hasNext()){
            Person person = it2.next();
            map.put(person.getName(),person);
        }

        Set<String> set1 = map.keySet();
        for (String s: set1) {
            System.out.println(s+"--->"+map.get(s));
        }
    }
}
