package com.mu.task1;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 17:46
 */
public class Test {
    public static void main(String[] args) {
        Police p = new Police("王五","警察");
        Gangster g =new Gangster("炫熊猫","匪");
        Gun ak47 = new Gun("AK47");
        Gun m16 = new Gun("M16");

        p.setIgun(ak47);
        g.setIgun(m16);

        p.fight(g,m16);
    }
}
