package com.hbpu.po;

public class Bbssection {
    private Integer sid;

    private String sname;

    private String snumber;

    private Integer sclickcount;

    private Integer sreplycount;

    private String spicture;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber == null ? null : snumber.trim();
    }

    public Integer getSclickcount() {
        return sclickcount;
    }

    public void setSclickcount(Integer sclickcount) {
        this.sclickcount = sclickcount;
    }

    public Integer getSreplycount() {
        return sreplycount;
    }

    public void setSreplycount(Integer sreplycount) {
        this.sreplycount = sreplycount;
    }

    public String getSpicture() {
        return spicture;
    }

    public void setSpicture(String spicture) {
        this.spicture = spicture == null ? null : spicture.trim();
    }
}