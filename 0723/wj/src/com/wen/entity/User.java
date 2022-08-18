package com.wen.entity;

/**
 * @author :muxiaowen
 * @date : 2022/7/23 15:34
 */
public class User {
    private Integer userId;
    private String userName;
    private String password;
    private String nickName;
    private String sex;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User(){}

    public User(String userName, String password, String nickName, String sex,String phone) {
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.sex = sex;
        this.phone = phone;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
