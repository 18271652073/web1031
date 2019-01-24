package com.hbpu.po;

public class Stubuild {
    private Integer bid;

    private String bname;

    private String btype;

    private String bdetail;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype == null ? null : btype.trim();
    }

    public String getBdetail() {
        return bdetail;
    }

    public void setBdetail(String bdetail) {
        this.bdetail = bdetail == null ? null : bdetail.trim();
    }
}