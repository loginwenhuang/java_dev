package com.wen.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/2 9:02
 */
public class Worker {
    private Integer id;
    private String name;
    private String info;

    public Worker() {
    }

    public Worker(Integer id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public Worker(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
