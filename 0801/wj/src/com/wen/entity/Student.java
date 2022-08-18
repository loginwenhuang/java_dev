package com.wen.entity;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 9:00
 */
public class Student {
    private Integer stuId;
    private String stuName;
    private String sex;
    private Date birthday;
    private Double tall;
    private Integer classId;

    public Student() {
    }

    public Student(Integer stuId, String stuName, String sex, Date birthday, Double tall, Integer classId) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.sex = sex;
        this.birthday = birthday;
        this.tall = tall;
        this.classId = classId;
    }

    public Student(Integer stuId, String stuName, String sex, Date birthday, Double tall) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.sex = sex;
        this.birthday = birthday;
        this.tall = tall;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
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

    public Double getTall() {
        return tall;
    }

    public void setTall(Double tall) {
        this.tall = tall;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", tall=" + tall +
                ", classId=" + classId +
                '}';
    }
}
