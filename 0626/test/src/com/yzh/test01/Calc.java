package com.yzh.test01;

/**
 * @author wen
 */
public class Calc {
    int num1;
    int num2;

    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calc() {

    }

    public int sum(){
        int sum = 0;
        for (int i = this.num1; i <= num2; i++) {
            sum+=i;
        }
        System.out.print(this.num1+"~"+this.num2+"的和:");
        return sum;
    }
    public void random_num(){
        int rand =(int)(Math.random()*100+1);
        System.out.println("1~100的随机数:"+rand);
    }
}
