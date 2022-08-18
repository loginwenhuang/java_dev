package com.wen.entity;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 14:46
 */
public class Staff {
    private Integer s_di;
    private String s_name;
    private String sex;
    private Date birthday;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private Integer d_id;

    public Staff() {
    }

    public Staff(String s_name, String sex, Date birthday, String phone, Integer d_id) {
        this.s_name = s_name;
        this.sex = sex;
        this.birthday = birthday;
        this.phone = phone;
        this.d_id = d_id;
    }

    public Integer getS_di() {
        return s_di;
    }

    public void setS_di(Integer s_di) {
        this.s_di = s_di;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
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

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "s_di=" + s_di +
                ", s_name='" + s_name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", d_id=" + d_id +
                '}';
    }
}
