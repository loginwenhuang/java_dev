package com.wen.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 16:33
 */
public class ClassInfo {
    private Integer classId;
    private String className;

    public ClassInfo() {
    }

    public ClassInfo(Integer classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public ClassInfo(String className) {
        this.className = className;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                '}';
    }
}
