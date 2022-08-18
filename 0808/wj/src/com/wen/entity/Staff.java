package com.wen.entity;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 9:08
 */
public class Staff {
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
    private String phone;
    private Integer d_id;

    public Staff() {
    }

    public Staff(String name, String sex, Date birthday, String phone, Integer d_id) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.phone = phone;
        this.d_id = d_id;
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

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", d_id=" + d_id +
                '}';
    }
}
