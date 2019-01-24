package com.hbpu.po;

import java.util.Date;

public class Sturecord {
    private Integer rid;

    private String rdromnum;

    private String rname;

    private String rnote;

    private Date rdate;

    private String rstate;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRdromnum() {
        return rdromnum;
    }

    public void setRdromnum(String rdromnum) {
        this.rdromnum = rdromnum == null ? null : rdromnum.trim();
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRnote() {
        return rnote;
    }

    public void setRnote(String rnote) {
        this.rnote = rnote == null ? null : rnote.trim();
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public String getRstate() {
        return rstate;
    }

    public void setRstate(String rstate) {
        this.rstate = rstate == null ? null : rstate.trim();
    }
}