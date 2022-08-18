package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/6 8:54
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Walnut hetao = new Walnut();
        Almond xingren = new Almond();
        ITool t1 = new Stone();
        ITool t2 = new Hammer();
        p.setiTool(t1);
        p.eat(hetao);
        p.eat(xingren);

        p.setiTool(t2);
        p.eat(hetao);
        p.eat(xingren);
    }
}
