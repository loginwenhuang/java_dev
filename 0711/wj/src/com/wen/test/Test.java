package com.wen.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 8:58
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set set = new HashSet();
        while(set.size()<5){
            System.out.println("请输入商品名称和商品价格:");
            Goods goods = new Goods(scanner.next(),scanner.nextDouble());
            if (set.contains(goods)){
                System.out.println("商品重复,请重新输入！");
                continue;
            }
            set.add(goods);
        }
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
