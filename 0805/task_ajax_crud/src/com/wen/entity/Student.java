package com.wen.entity;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/5 16:31
 */
public class Student {
    private Integer studnetId;
    private String name;
    private String sex;
    private Date birthday;
    private String province;
    private Integer classId;


    public Student() {
    }

    public Student(Integer studnetId, String name, String sex, Date birthday, String province, Integer classId) {
        this.studnetId = studnetId;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.province = province;
        this.classId = classId;
    }

    public Student(String name, String sex, Date birthday, String province, Integer classId) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.province = province;
        this.classId = classId;
    }

    public Integer getStudnetId() {
        return studnetId;
    }

    public void setStudnetId(Integer studnetId) {
        this.studnetId = studnetId;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studnetId=" + studnetId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", province='" + province + '\'' +
                ", classId=" + classId +
                '}';
    }
}
