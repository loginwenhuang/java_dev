package com.wen.task2;

import java.util.*;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 18:05
 */
public class Test2 {
    public static void main(String[] args) {
        List<Goods> list = new LinkedList<>();
        list.add(new Goods("饮料","冰红茶"));
        list.add(new Goods("食品","方便面"));
        list.add(new Goods("日用品","洗衣粉"));
        list.add(new Goods("饮料","咖啡"));
        list.add(new Goods("食品","火腿肠"));

        Map<String,Goods> map = new HashMap<>();
        Iterator<Goods> it = list.iterator();

        while (it.hasNext()){
            Goods goods = it.next();
            map.put(goods.getName(),goods);
        }

        Iterator<String> it1 = map.keySet().iterator();
        while (it1.hasNext()){
            String s = it1.next();
            System.out.println(map.get(s).getType()+"--->"+s);
        }
    }
}
