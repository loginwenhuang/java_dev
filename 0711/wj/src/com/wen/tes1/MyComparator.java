package com.wen.tes1;

import java.util.Comparator;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 10:26
 */
public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Car && o2 instanceof Car){
            Car c1 = (Car) o1;
            Car c2 = (Car) o2;
            if(c1.price>c2.price){
                return 1;
            }else if(c1.price<c2.price){
                return -1;
            }else {
                return c1.brand.compareTo(c2.brand);
            }

        }
        return -1;
    }
}
