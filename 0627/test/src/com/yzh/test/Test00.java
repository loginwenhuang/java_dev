package com.yzh.test;

import java.util.Scanner;

/**
 * @author wen
 */
public class Test00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum =0;
        boolean flag =true;
        double max = 0;
        double min = -1;
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第"+i+"个同学的成绩:");
            double t = scanner.nextDouble();
            if(t>100||t<0){
                System.out.println("输入的成绩有误");
                flag =false;
                break;
            }
            sum +=t;
            if(max<t){
                max = t;
            }
            if(min==-1||min>t){
                min = t;
            }
            if(t<80){
                continue;
            }
            count++;
        }
        if(flag){
            System.out.println("总分:"+sum+"\n平均分:"+(sum/5)+"\n最高分:"+max+"\n最低分:"+min+"\n80分以上学生比例:"+(count/5.0*100)+"%");
        }

    }
}
