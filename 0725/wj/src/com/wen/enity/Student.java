package com.wen.enity;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 9:01
 */
public class Student {
    private Integer stuId;
    private String stuName;
    private String sex;
    private Date birthday;

    public Student() {
    }

    public Student(Integer stuId, String stuName, String sex, Date birthday) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.sex = sex;
        this.birthday = birthday;
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

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
