package com.java.subjects;

import java.util.Arrays;

/**
 * @author :muxiaowen
 * @date : 2022/7/2 17:54
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 5};
        int target = 6;
        int n = nums.length - 1;
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; ) {
            if ((nums[i] + nums[n]) > target && n > 0) {
                System.out.println("一");
                n--;
            } else {
                count += n - i;
                i++;
            }
        }
        System.out.println(count);
    }
}
