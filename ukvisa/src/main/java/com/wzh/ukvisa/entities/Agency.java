package com.wzh.ukvisa.entities;

import java.util.Date;

public class Agency {

    private Integer aid;
    //旅行社名字
    private String agencyname;
    //旅行社联系人
    private String people;
    //联系人电话
    private String phone;
    //地址
    private String address;
    //传真
    private String fax;
    //描述
    private String describe;
    // 创建时间
    private Date createDate;

    public Agency() {
    }

    public Agency(Integer aid, String agencyname, String people, String phone, String address, String fax, String describe, Date createDate) {
        this.aid = aid;
        this.agencyname = agencyname;
        this.people = people;
        this.phone = phone;
        this.address = address;
        this.fax = fax;
        this.describe = describe;
        this.createDate = createDate;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAgencyname() {
        return agencyname;
    }

    public void setAgencyname(String agencyname) {
        this.agencyname = agencyname;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "aid=" + aid +
                ", agencyname='" + agencyname + '\'' +
                ", people='" + people + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", fax='" + fax + '\'' +
                ", describe='" + describe + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
