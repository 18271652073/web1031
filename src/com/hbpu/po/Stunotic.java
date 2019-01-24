package com.hbpu.po;

import java.util.Date;

public class Stunotic {
    private Integer nid;

    private String ndromnum;

    private Integer nwater;

    private Integer nelectric;

    private Date ndate;

    private String nstate;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNdromnum() {
        return ndromnum;
    }

    public void setNdromnum(String ndromnum) {
        this.ndromnum = ndromnum == null ? null : ndromnum.trim();
    }

    public Integer getNwater() {
        return nwater;
    }

    public void setNwater(Integer nwater) {
        this.nwater = nwater;
    }

    public Integer getNelectric() {
        return nelectric;
    }

    public void setNelectric(Integer nelectric) {
        this.nelectric = nelectric;
    }

    public Date getNdate() {
        return ndate;
    }

    public void setNdate(Date ndate) {
        this.ndate = ndate;
    }

    public String getNstate() {
        return nstate;
    }

    public void setNstate(String nstate) {
        this.nstate = nstate == null ? null : nstate.trim();
    }
}