package com.hbpu.po;

import java.util.Date;

public class Studressing {
    private Integer did;

    private String dstuid;

    private String dname;

    private String dsex;

    private String ddromnum;

    private String dcollege;

    private String dmajor;

    private String ddatial;

    private Date ddate;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDstuid() {
        return dstuid;
    }

    public void setDstuid(String dstuid) {
        this.dstuid = dstuid == null ? null : dstuid.trim();
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDsex() {
        return dsex;
    }

    public void setDsex(String dsex) {
        this.dsex = dsex == null ? null : dsex.trim();
    }

    public String getDdromnum() {
        return ddromnum;
    }

    public void setDdromnum(String ddromnum) {
        this.ddromnum = ddromnum == null ? null : ddromnum.trim();
    }

    public String getDcollege() {
        return dcollege;
    }

    public void setDcollege(String dcollege) {
        this.dcollege = dcollege == null ? null : dcollege.trim();
    }

    public String getDmajor() {
        return dmajor;
    }

    public void setDmajor(String dmajor) {
        this.dmajor = dmajor == null ? null : dmajor.trim();
    }

    public String getDdatial() {
        return ddatial;
    }

    public void setDdatial(String ddatial) {
        this.ddatial = ddatial == null ? null : ddatial.trim();
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }
}