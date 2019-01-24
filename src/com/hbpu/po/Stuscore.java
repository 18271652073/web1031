package com.hbpu.po;

public class Stuscore {
    private Integer sid;

    private String sdromnum;

    private Integer shygiene;

    private Integer sculture;

    private Integer ssave;

    private String sgrade;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSdromnum() {
        return sdromnum;
    }

    public void setSdromnum(String sdromnum) {
        this.sdromnum = sdromnum == null ? null : sdromnum.trim();
    }

    public Integer getShygiene() {
        return shygiene;
    }

    public void setShygiene(Integer shygiene) {
        this.shygiene = shygiene;
    }

    public Integer getSculture() {
        return sculture;
    }

    public void setSculture(Integer sculture) {
        this.sculture = sculture;
    }

    public Integer getSsave() {
        return ssave;
    }

    public void setSsave(Integer ssave) {
        this.ssave = ssave;
    }

    public String getSgrade() {
        return sgrade;
    }

    public void setSgrade(String sgrade) {
        this.sgrade = sgrade == null ? null : sgrade.trim();
    }
}