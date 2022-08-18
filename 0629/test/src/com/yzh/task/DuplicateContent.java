package com.yzh.task;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 19:21
 */
public class DuplicateContent {

    public static void repeat(String st) {
        String str = st;
        StringBuffer sb = new StringBuffer();
        int[][] index = new int[str.length()*str.length()][str.length()*str.length()];
        int count = 0;
        int n = 0;
        int num = 0;
        while (num<(str.length())) {
            sb.delete(0, sb.length());
            for (int i = 0; i < str.length() - num; i++) {
                String sub = str.substring(i, (i + num+1));
                //System.out.println("第一次："+sub);
                for (int j = i+1; j < str.length() - num;j++) {
                    //System.out.println("第二次："+str.substring(j,j+num+1));
                    if (sub.equals(str.substring(j, j + num+1))) {
                        index[count][n++] = j;
                    }
                }
                if (n > 0 && sb.indexOf(sub) == -1) {
                    sb.append(sub);
                    if(num==0){
                        System.out.println("字符串长度:"+(num+1)+" 重复内容:" + sub + "  重复次数:" + n + "  第一个所在位置:"+(i+1));
                    }else {
                        System.out.println("字符串长度:"+(num+1)+" 重复内容:" + sub + "  重复次数:" + n + "  第一个所在位置:"+(i+1)+" 结束位置:"+(i+num+1));
                    }
                }
                count++;
                n = 0;
            }
            num++;
        }
    }
}
