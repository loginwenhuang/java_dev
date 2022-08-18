package com.wen.test1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author :muxiaowen
 * @date : 2022/7/10 16:36
 */
public class Test {
    public static void main(String[] args) {
        //Set:1.无序 2.不重复 3.没有下标
        Set set = new HashSet();
        set.add("bbb");
        set.add("bbb");
        set.add(true);
        set.add(12.234);
        set.add("aaa");
        set.add("aaa");
        set.add(100);
        set.add(200);
        set.add(new Student("张三",20));
        //打印集合内容
        //System.out.println(set);
        //打印长度
        //System.out.println(set.size());
        //set无法按照索引获取数据，因为set是无序的没有下标
        //删除
        //set.remove("aaa");
        //System.out.println(set);
        //包含某个数据
        //System.out.println(set.contains("bbb"));
        //是否为空
        //System.out.println(set.isEmpty());
        //System.out.println("================================");
        //遍历set集合
        //方式1：for Each
        for (Object obj : set){
            System.out.println(obj);
        }
        System.out.println("============================");
        //方式2: Iterator迭代器
        //通过集合对象的iterator()方法，返回一个Iterator对象，通过这个对象可以遍历集合元素
        Iterator it =  set.iterator();
        //it.hasNext():判断集合是否有数据,返回true/false
        //it.next():读取集合中的一个数据
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }
}
