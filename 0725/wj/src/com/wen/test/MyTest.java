package com.wen.test;

import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 11:46
 */
public class MyTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MyTest.class);
        Scanner scanner = new Scanner(System.in);
        try {
            logger.debug("运算开始");
            logger.debug("准备输入第一个数:");
            int num1 = scanner.nextInt();
            logger.info("第一个数:"+num1);
            logger.debug("准备输入第二个数:");
            int num2 = scanner.nextInt();
            logger.info("第二个数:"+num2);

            logger.debug("准备运算");
            int res = num1/num2;
            logger.info("运算结果:"+res);
            logger.debug("运算结束");
        } catch (ArithmeticException e) {
            logger.info("发生了运算错误:"+e.getMessage());
            e.printStackTrace();
        }catch (InputMismatchException e){
            logger.info("发生了输入错误:"+e.getMessage());
            e.printStackTrace();
        }
    }
}
