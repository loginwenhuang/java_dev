package com.yzh.task;

public class Dog {
    String name;
    String varieties;
    int age;
    public void display(){
        System.out.println(this.name+"\n"+this.varieties+"\n"+this.age);
    }
    public void eat(String food){
        System.out.println(this.name+"正在吃"+food);
    }
    public String guard(String people){
        String respond;
        if(people.equals("生人")){
            respond = "旺旺";
        }else if(people.equals("主人")){
            respond = "摇尾巴";
        }else {
            respond = "不认识不知道不管了";
        }
        return respond;
    }
}
