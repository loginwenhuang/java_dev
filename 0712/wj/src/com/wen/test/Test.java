package com.wen.test;

import java.util.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/12 8:59
 */
public class Test {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        list.add(new Student("A01","xxx1",19));
        list.add(new Student("A01","xxx2",17));
        list.add(new Student("A01","xxx3",18));
        list.add(new Student("A02","xxx4",19));
        list.add(new Student("A02","xxx5",20));


        Map<String,String> map = new HashMap<>();
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            if (map.containsKey(s.getClas())){
                map.put(s.getClas(),map.get(s.getClas())+","+s.getName());
                continue;
            }
            map.put(s.getClas(),s.getName());
        }

        Iterator<String> it1 = map.keySet().iterator();
        while (it1.hasNext()){
            String s = it1.next();
            System.out.println(s+"--->"+map.get(s));
        }
    }
}
