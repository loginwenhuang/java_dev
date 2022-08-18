package com.java.subjects;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 20:11
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int n = 100;
        List<String> answer = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            StringBuffer sb = new StringBuffer();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.length() == 0) {
                sb.append(i);
            }
            answer.add(sb.toString());
        }
        System.out.println(answer);
        }
}