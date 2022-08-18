package com.mu.test2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/5 11:30
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;

        try{
            System.out.println("输入第一个数");
            a = scanner.nextInt();
            System.out.println("输入第二个数");
            b = scanner.nextInt();

            int res = a/b;
            System.out.println(a+"/"+b+"="+res);
            int[] nums = new int[2];
            nums[2] = res;

        }catch (InputMismatchException ex){
            System.out.println("输入出错了!");
            System.out.println("错误内容"+ex.getMessage());
            ex.printStackTrace();
        }catch (ArithmeticException ex){
            System.out.println("计算出错了!");
            System.out.println("错误内容:"+ex.getMessage());
            ex.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("数组出错了!");
            System.out.println("错误内容:"+ex.getMessage());
            ex.printStackTrace();
        }catch (Exception ex){
            System.out.println("出错了!");
            System.out.println("错误内容:"+ex.getMessage());
            ex.printStackTrace();
        }finally {
            System.out.println("我滴任务完成了!");
        }
        System.out.println("======程序执行结束=====");
    }
}
