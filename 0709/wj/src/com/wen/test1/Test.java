package com.wen.test1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author :muxiaowen
 * @date : 2022/7/9 10:36
 */
public class Test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        ArrayList a = new ArrayList(10);
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");

//        for (int i = arrayList.size()-1; i>=0; i--) {
//            arrayList.remove(i);
//        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            arrayList.remove(i);
//        }
//        System.out.println(arrayList);
//        for (Object obj: arrayList) {
//            arrayList.remove(obj);
//        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            if(it.next()=="aaa"){
                it.remove();
            }
        }
        System.out.println(arrayList);
    }
}
