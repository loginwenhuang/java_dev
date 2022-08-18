package com.yzh.test3;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 10:58
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {5,4,6,2,3};
        int maxPos = 0;
        int minPos = 0;
        for (int i =0 ;i< nums.length;i++){
            maxPos=nums[maxPos]<nums[i]?i:maxPos;
            minPos=nums[minPos]>nums[i]?i:minPos;
        }
        System.out.println("最大值:"+nums[maxPos]+" 位置:"+(maxPos+1)+"\n最小值:"+nums[minPos]+" 位置:"+(minPos+1));
    }
}
