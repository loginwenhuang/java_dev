package com.yzh.test2;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 10:18
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        String[] sts;
        sts = new String[]{"abc","bcd"};
        double[] ds = {1.1,2.2,3.3};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        for(String st:sts){
            System.out.println(st);
        }
        for (double d : ds){
            System.out.println(d);
        }

        //扩展
        Names.name();
    }
}
