package com.hbpu.po;

public class Studrom {
    private Integer drid;

    private String drbuildid;

    private String drdromid;

    private Integer drnum;

    private Integer drcount;

    private String drtel;

    public Integer getDrid() {
        return drid;
    }

    public void setDrid(Integer drid) {
        this.drid = drid;
    }

    public String getDrbuildid() {
        return drbuildid;
    }

    public void setDrbuildid(String drbuildid) {
        this.drbuildid = drbuildid == null ? null : drbuildid.trim();
    }

    public String getDrdromid() {
        return drdromid;
    }

    public void setDrdromid(String drdromid) {
        this.drdromid = drdromid == null ? null : drdromid.trim();
    }

    public Integer getDrnum() {
        return drnum;
    }

    public void setDrnum(Integer drnum) {
        this.drnum = drnum;
    }

    public Integer getDrcount() {
        return drcount;
    }

    public void setDrcount(Integer drcount) {
        this.drcount = drcount;
    }

    public String getDrtel() {
        return drtel;
    }

    public void setDrtel(String drtel) {
        this.drtel = drtel == null ? null : drtel.trim();
    }
}