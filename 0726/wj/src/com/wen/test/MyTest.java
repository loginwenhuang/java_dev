package com.wen.test;

import org.apache.log4j.Logger;

import javax.xml.bind.MarshalException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/26 9:00
 */
public class MyTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MyTest.class);
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[2];
        String[] sts = new String[]{"请输入第一个数:", "请输入第二个数"};
        logger.debug("开始为数组赋值");
        try {
            for (int i = 0; i < nums.length; i++) {
                System.out.println(sts[i]);
                nums[i] =scanner.nextInt();
                logger.info(sts[i]+nums[i]);
            }
            nums[2] = nums[0]/nums[1];
            logger.info("计算结果:"+nums[2]);
        }catch (InputMismatchException e) {
            logger.error("输入不匹配异常! "+e.getMessage());
        }catch (ArithmeticException e){
            logger.error("算数异常! "+e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            logger.error("数组下标越界异常! "+e.getMessage());
        }finally {
            logger.info("程序执行结束!");
        }
    }
}
