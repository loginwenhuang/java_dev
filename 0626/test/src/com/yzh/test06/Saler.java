package com.yzh.test06;

/**
 * @author wen
 */
public class Saler {
        String name;
        static int ticket = 10;
        public void sale() {
            if (ticket > 0) {
                ticket--;
                System.out.println(this.name + "卖票一张,剩余:" + ticket);
            } else {
                System.out.println(this.name + "票已卖完");
            }
        }
}
