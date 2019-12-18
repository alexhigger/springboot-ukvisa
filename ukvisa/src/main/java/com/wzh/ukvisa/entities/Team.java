package com.wzh.ukvisa.entities;

import java.util.Date;

public class Team {
    private Integer tid;
    // 团组编码
    private String teamname;
    // 团组人数
    private Integer teamnum;
    // 总金额
    private Double money;
    // 供应商
    private Agency agency;
    // 是否付款 0 未付款， 1已付款
    private Integer vip;
    // 创建时间
    private Date createDate;

    private Integer aid;

    public Team() {
    }

    public Team(Integer tid, String teamname, Integer teamnum, Double money, Agency agency, Integer vip, Date createDate, Integer aid) {
        this.tid = tid;
        this.teamname = teamname;
        this.teamnum = teamnum;
        this.money = money;
        this.agency = agency;
        this.vip = vip;
        this.createDate = createDate;
        this.aid = aid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public Integer getTeamnum() {
        return teamnum;
    }

    public void setTeamnum(Integer teamnum) {
        this.teamnum = teamnum;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        return "Team{" +
                "tid=" + tid +
                ", teamname='" + teamname + '\'' +
                ", teamnum=" + teamnum +
                ", money=" + money +
                ", agency=" + agency +
                ", vip=" + vip +
                ", createDate=" + createDate +
                ", aid=" + aid +
                '}';
    }
}
