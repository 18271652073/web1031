package com.hbpu.po;

import java.util.Date;

public class Bbsreply {
    private Integer rid;

    private Integer rtid;

    private Integer tuid;

    private String rcontent;

    private Date rreplydate;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getRtid() {
        return rtid;
    }

    public void setRtid(Integer rtid) {
        this.rtid = rtid;
    }

    public Integer getTuid() {
        return tuid;
    }

    public void setTuid(Integer tuid) {
        this.tuid = tuid;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent == null ? null : rcontent.trim();
    }

    public Date getRreplydate() {
        return rreplydate;
    }

    public void setRreplydate(Date rreplydate) {
        this.rreplydate = rreplydate;
    }
}