package com.yzh.test;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 8:59
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Goods[] goods = new Goods[10];
        String name;
        Double price;
        int count =0;
        while (true){
            System.out.println("请选择:1.添加商品  2.查询商品 3.退出 4.按商品价格排序");
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    System.out.print("请输入商品名:");
                    name = scanner.next();
                    System.out.print("请输入商品价格:");
                    price = scanner.nextDouble();
                    goods[count++] = new Goods(name,price);
                    break;
                case 2:
                    System.out.print("商品名\t"+"价格\n");
                    for (int i = 0; i < count; i++) {
                        System.out.print(goods[i].name+"\t");
                        System.out.print(goods[i].price+"\n");
                    }
                    break;
                case 3:
                    return;
                case 4:
                    for (int i = 1; i < count; i++) {
                        for (int j = 0; j < count-i; j++) {
                            if(goods[j].price>goods[j+1].price){
                                Goods good = goods[j];
                                goods[j]=goods[j+1];
                                goods[j+1]=good;
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
