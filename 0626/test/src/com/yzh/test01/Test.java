package com.yzh.test01;

/**
 * @author wen
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car("驷马",200,110);
        System.out.println("一共花了"+String.format("%.2f",car.addOil(12, 8.9F))+"元");
        car.run(90);

        Calc calc = new Calc(5,6);
        System.out.println(calc.sum());
        calc.random_num();
    }
}
