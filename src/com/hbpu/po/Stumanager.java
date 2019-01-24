package com.hbpu.po;

public class Stumanager {
    private Integer mgid;

    private String mgstuid;

    private String mgname;

    private String mgpassword;

    private String mgbuildnum;

    private String mgmyname;

    private String mgsex;

    private String mgtel;

    private String mgpower;

    public Integer getMgid() {
        return mgid;
    }

    public void setMgid(Integer mgid) {
        this.mgid = mgid;
    }

    public String getMgstuid() {
        return mgstuid;
    }

    public void setMgstuid(String mgstuid) {
        this.mgstuid = mgstuid == null ? null : mgstuid.trim();
    }

    public String getMgname() {
        return mgname;
    }

    public void setMgname(String mgname) {
        this.mgname = mgname == null ? null : mgname.trim();
    }

    public String getMgpassword() {
        return mgpassword;
    }

    public void setMgpassword(String mgpassword) {
        this.mgpassword = mgpassword == null ? null : mgpassword.trim();
    }

    public String getMgbuildnum() {
        return mgbuildnum;
    }

    public void setMgbuildnum(String mgbuildnum) {
        this.mgbuildnum = mgbuildnum == null ? null : mgbuildnum.trim();
    }

    public String getMgmyname() {
        return mgmyname;
    }

    public void setMgmyname(String mgmyname) {
        this.mgmyname = mgmyname == null ? null : mgmyname.trim();
    }

    public String getMgsex() {
        return mgsex;
    }

    public void setMgsex(String mgsex) {
        this.mgsex = mgsex == null ? null : mgsex.trim();
    }

    public String getMgtel() {
        return mgtel;
    }

    public void setMgtel(String mgtel) {
        this.mgtel = mgtel == null ? null : mgtel.trim();
    }

    public String getMgpower() {
        return mgpower;
    }

    public void setMgpower(String mgpower) {
        this.mgpower = mgpower == null ? null : mgpower.trim();
    }
}