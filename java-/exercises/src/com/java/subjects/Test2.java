package com.java.subjects;

/**
 * @author :muxiaowen
 * @date : 2022/7/3 9:30
 */
public class Test2 {
    public static void main(String[] args) {
                int num = 449572;
                int xPos = 209397;
                int yPos = 306801;
                //大正方形的边长：a
                long a = num;
                //小正方形的边长：b
                long b = Math.max(xPos*2<num?num-xPos*2:(xPos+1)*2-num,yPos*2<num?num-yPos*2:(yPos+1)*2-num);
                System.out.println(b);
                //小正方形以外的数：
                long flag = a*a-b*b;
                long pos = (num-b)/2;
                long index = 0;
                System.out.println(flag+"  "+pos);
                //小正方形边上走了几个数,先判断在那条边上;
                if(xPos<yPos){
                    if(yPos==num-1-pos){
                        index = (b+(xPos-pos));
                    }else {
                        index = yPos - pos+1;
                    }
                }else if(xPos>yPos){
                    if(yPos == pos){
                        index = b*3-2 + num-1-pos-xPos;
                    }else {
                        index = b*2-1 + num-1-pos-yPos;
                    }
                }else {
                    if(xPos==pos){
                        index = xPos -pos+1;
                    }else {
                        index = b*2-1;
                    }
                }
                long res = index+flag;
                System.out.println(res%9==0?9:res%9);

            }

    }
