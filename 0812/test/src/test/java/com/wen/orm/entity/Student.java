package com.wen.orm.entity;

import com.wen.orm.annotation.ColumnInfo;
import com.wen.orm.annotation.PrimaryKey;
import com.wen.orm.annotation.Table;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 14:48
 */
@Table(tableName = "student")
public class Student {
    @PrimaryKey()
    @ColumnInfo(colName = "s_id",colType = "int")
    private Integer s_id;

    @ColumnInfo(colName = "s_name",colType = "varchar")
    private String s_name;

    @ColumnInfo(colName = "s_birth",colType = "date")
    private Date s_birth;

    @ColumnInfo(colName = "s_sex",colType = "char")
    private String s_sex;

    public Student() {
    }

    public Student(Integer s_id, String s_name, Date s_birth, String s_sex) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_birth = s_birth;
        this.s_sex = s_sex;
    }

    public Student(String s_name, Date s_birth, String s_sex) {
        this.s_name = s_name;
        this.s_birth = s_birth;
        this.s_sex = s_sex;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Date getS_birth() {
        return s_birth;
    }

    public void setS_birth(Date s_birth) {
        this.s_birth = s_birth;
    }

    public String getS_sex() {
        return s_sex;
    }
    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_birth=" + s_birth +
                ", s_sex='" + s_sex + '\'' +
                '}';
    }
}
