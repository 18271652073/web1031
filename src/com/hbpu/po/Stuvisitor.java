package com.hbpu.po;

import java.util.Date;

public class Stuvisitor {
    private Integer vid;

    private Date vcdate;

    private Date vldate;

    private String vname;

    private String vdrom;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Date getVcdate() {
        return vcdate;
    }

    public void setVcdate(Date vcdate) {
        this.vcdate = vcdate;
    }

    public Date getVldate() {
        return vldate;
    }

    public void setVldate(Date vldate) {
        this.vldate = vldate;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname == null ? null : vname.trim();
    }

    public String getVdrom() {
        return vdrom;
    }

    public void setVdrom(String vdrom) {
        this.vdrom = vdrom == null ? null : vdrom.trim();
    }
}