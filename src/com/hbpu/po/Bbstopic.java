package com.hbpu.po;

import java.util.Date;

public class Bbstopic {
    private Integer tid;

    private Integer tsid;

    private Integer tuid;

    private String ttitle;

    private String tcontent;

    private String tflag;

    private Integer tclickcount;

    private Date tfdate;

    private Date tldate;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getTsid() {
        return tsid;
    }

    public void setTsid(Integer tsid) {
        this.tsid = tsid;
    }

    public Integer getTuid() {
        return tuid;
    }

    public void setTuid(Integer tuid) {
        this.tuid = tuid;
    }

    public String getTtitle() {
        return ttitle;
    }

    public void setTtitle(String ttitle) {
        this.ttitle = ttitle == null ? null : ttitle.trim();
    }

    public String getTcontent() {
        return tcontent;
    }

    public void setTcontent(String tcontent) {
        this.tcontent = tcontent == null ? null : tcontent.trim();
    }

    public String getTflag() {
        return tflag;
    }

    public void setTflag(String tflag) {
        this.tflag = tflag == null ? null : tflag.trim();
    }

    public Integer getTclickcount() {
        return tclickcount;
    }

    public void setTclickcount(Integer tclickcount) {
        this.tclickcount = tclickcount;
    }

    public Date getTfdate() {
        return tfdate;
    }

    public void setTfdate(Date tfdate) {
        this.tfdate = tfdate;
    }

    public Date getTldate() {
        return tldate;
    }

    public void setTldate(Date tldate) {
        this.tldate = tldate;
    }
}