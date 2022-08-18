package com.wen.entity;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 16:11
 */
public class Student {
    private Integer stuId;
    private String stuName;
    private String sex;
    private Date birthday;
    private Integer userId;

    public Student() {
    }

    public Student(Integer stuId, String stuName, String sex, Date birthday) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.sex = sex;
        this.birthday = birthday;
    }

    public Student(String stuName, String sex, Date birthday) {
        this.stuName = stuName;
        this.sex = sex;
        this.birthday = birthday;
    }

    public Student(String stuName, String sex, Date birthday, Integer userId) {
        this.stuName = stuName;
        this.sex = sex;
        this.birthday = birthday;
        this.userId = userId;
    }

    public Student(Integer stuId, String stuName, String sex, Date birthday, Integer userId) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.sex = sex;
        this.birthday = birthday;
        this.userId = userId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", userId=" + userId +
                '}';
    }
}
