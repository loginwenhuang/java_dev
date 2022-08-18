package com.wen.entity;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/6 9:04
 */
public class Worker {
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
    private String phone;

    public Worker() {
    }

    public Worker(Integer id, String name, String sex, Date birthday, String phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.phone = phone;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
