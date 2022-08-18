package com.yzh.test02;

/**
 * @author wen
 */
public class Sum {
    /**
     * 方法重载
     */
    public void add(int x,int y){
        System.out.println(x+y);
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public void add(int x,double y){
        System.out.println(x+y);
    }
    public void add(String x,String y){
        System.out.println(x.equals(y));
    }
    public double add(double x,int y){
        return x+y;
    }
}
