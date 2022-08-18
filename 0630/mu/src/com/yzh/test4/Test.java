package com.yzh.test4;

import java.util.Arrays;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 11:30
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {5,4,6,7,1,2};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int num = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = num;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

        int[] nums2 = {5,4,6,7,1,2};

        for (int i = 0; i < nums2.length; i++) {
            int k = i;
            for (int j = i; j < nums2.length; j++) {
                k = nums2[k]>nums2[j]?j:k;

            }
            if (k != i) {
                int num = nums2[k];
                nums2[k] = nums2[i];
                nums2[i] = num;
            }
        }
        System.out.println(Arrays.toString(nums2));

    }
}
