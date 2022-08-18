package com.wen.test3;

import java.awt.image.RasterOp;
import java.util.ArrayList;

/**
 * @author :muxiaowen
 * @date : 2022/7/10 14:42
 */
public class Test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("aaa");
        for (int i = 0; i < arrayList.size(); i++) {
            //默认存储的数据都是Object类型的
            Object obj = arrayList.get(i);
            System.out.println(obj);
        }
        for (Object obj:arrayList) {
            System.out.println(obj);
        }
    }
}
