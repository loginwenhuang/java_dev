package com.yzh.test;

import java.util.Scanner;

/**
 * @author wen
 */
public class Test00 {
    public static void main(String[] args) {
        System.out.println("请输入你要买的商品");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println("请输入商品的单价");
        double price = s.nextDouble();
        System.out.println("请输入要购买的数量");
        int quantity = s.nextInt();
        int i;
        double tol =0;
        for(i=0;i<quantity;i++){
            if(i%2==0){
                tol+=0.5;
            }else {
                tol++;
            }
        }
        double tol1 = price*tol;
        System.out.println(name+"商品，单价"+price+"购买了"+quantity+"件，一共花了"+tol1+"元");

        System.out.println("请输入你要买的商品");
        Scanner s3 = new Scanner(System.in);
        String name3 = s3.next();
        System.out.println("请输入商品的单价");
        double price3 = s3.nextDouble();
        System.out.println("请输入要购买的数量");
        int quantity3 = s3.nextInt();
        tol =0;
        for(i=0;i<quantity3;i++){
            if(i%2==0){
                tol+=0.5;
            }else {
                tol++;
            }
        }
        double tol3 = price3*tol;
        System.out.println(name3+"商品，单价"+price3+"购买了"+quantity3+"件，一共花了"+tol3+"元");

        System.out.println("请输入你要买的商品");
        Scanner s1 = new Scanner(System.in);
        String name1 = s1.next();
        System.out.println("请输入商品的单价");
        double price1 = s1.nextDouble();
        System.out.println("请输入要购买的数量");
        int quantity1 = s1.nextInt();
        tol =0;
        for(i=0;i<quantity1;i++){
            if(i%2==0){
                tol+=0.5;
            }else {
                tol++;
            }
        }
        double tol2 = price1*tol;
        System.out.println(name1+"商品，单价"+price1+"购买了"+quantity1+"件，一共花了"+tol2+"元");

        System.out.println("买东西一共花了"+(tol1+tol2+tol3)+"元");
    }
}
