package com.mu.test2;

import java.util.Scanner;

/**
 * @author: hy
 * @create: 2022-07-06 09:47:00
 */
public class Test {
    public static int he(int start,int end){
        int sum = 0;
        for(int i=start;i<=end;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("请输入第一个数:");
            int num1 = sc.nextInt();
            System.out.println("请输入第二个数:");
            int num2 = sc.nextInt();
            int res = num1 / num2;
            System.out.println("结果:" + res);

            int sum = he(1, 5);
            System.out.println("和:" + sum);
        }catch (Exception ex){
            System.out.println("出错了:"+ex.getMessage());
        }

        System.out.println("运行结束");

    }
}
