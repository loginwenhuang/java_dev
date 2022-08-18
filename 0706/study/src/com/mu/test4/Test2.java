package com.mu.test4;

/**
 * @author :muxiaowen
 * @date : 2022/7/6 20:40
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
//        long num = k * threshold;
//        int count =0;
//
//        for(int i = 0;i<=arr.length-k;i++){
//            long sum = 0;
//            int flag =k;
//            while(flag!=0){
//                sum += arr[i+flag-1];
//                flag--;
//            }
//            if(sum >= num){
//                count++;
//            }
//        }
//        System.out.println(count);
        int n = arr.length;
        if (threshold == 0) {
            System.out.println(n-k+1);
        }
        int left = 0;
        int right = 0;
        int cnt = 0;
        int res = 0;
        int min = k * threshold;
        while (right < n) {
            cnt += arr[right];

            //窗口大于k 收缩
            if (right - left + 1 > k) {
                cnt -= arr[left];
                left++;
            }

            //窗口等于K  如果满足条件 答案加一
            if (right - left + 1 == k && cnt >= min) {
                res++;
            }
            right++;
        }
        System.out.println(res);
    }

}
