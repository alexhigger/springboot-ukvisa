package com.wzh.ukvisa.entities;

/**
 * 新实体，用于team+agency
 */
public class TeamAgency extends Team {
    private String agencyname;

    public TeamAgency() {
    }

    public TeamAgency(String agencyname) {
        this.agencyname = agencyname;
    }

    public String getAgencyname() {
        return agencyname;
    }

    public void setAgencyname(String agencyname) {
        this.agencyname = agencyname;
    }

    @Override
    public String toString() {
        return "TeamAgency{" +
                "agencyname='" + agencyname + '\'' +
                '}';
    }
}
