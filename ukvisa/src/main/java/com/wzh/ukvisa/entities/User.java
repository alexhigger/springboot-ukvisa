package com.wzh.ukvisa.entities;

import java.util.Date;

public class User {
    private Integer id;
    //用户名
    private String username;
    //真实姓名
    private String realname;
    //用户密码
    private String password;
    //性别：1 女  2 男
    private Integer gender;
    //生日
    private Date birthday;
    //1经理  2主管  3专员
    private Integer usertype;

    public User() {
    }

    public User(Integer id, String username, String realname, String password, Integer gender, Date birthday, Integer usertype) {
        this.id = id;
        this.username = username;
        this.realname = realname;
        this.password = password;
        this.gender = gender;
        this.birthday = birthday;
        this.usertype = usertype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", usertype=" + usertype +
                '}';
    }
}
