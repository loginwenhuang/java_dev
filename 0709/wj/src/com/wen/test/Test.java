package com.wen.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/9 8:59
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new LinkedList();
        String name;
        String sex;
        while(true){
            System.out.print("请输入姓名:");
            name = scanner.next();
            System.out.print("请输入性别:");
            sex = scanner.next();
            Perple perple = new Perple(name,sex);
            if(list.contains(perple)){
                System.out.println("这位同志已存在，请重新输入!");
                continue;
            }
            list.add(perple);
            System.out.println("是否继续(y/n)?");
            if(scanner.next().equals("n")){
                break;
            }
        }
        //System.out.println("录入的学生信息是:\n"+list);
        for (Object obj: list) {
            System.out.println(obj);
        }
    }
}
