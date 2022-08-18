package com.yzh.task2;

public class Programmer {
    String name;
    int yard_age;
    String position;
    public Programmer(){

    }
    public Programmer(String name,int yard_age,String position){
        this.name = name;
        this.yard_age= yard_age;
        this.position = position;
    }
    public void introduce(){
        System.out.println(this.name+" "+this.yard_age+"岁"+this.position);
    }
    public void programming(String project){
        System.out.println(this.name+"在写"+project+"项目的代码");
    }
    public String bug(int hour){
        String bug;
        if(hour>2){
            bug = "没找到bug";
        }else {
            bug ="找到了bug";
        }
        return bug;
    }
    public Double work_overtime(int hour,double pay){
        System.out.println(this.name+"加班"+hour+"小时,每小时"+pay+"元");
        return hour * pay;
    }
}
