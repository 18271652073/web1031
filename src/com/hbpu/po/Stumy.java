package com.hbpu.po;

import java.util.Date;

public class Stumy {
    private Integer mid;

    private String mstuid;

    private String mname;

    private String mpassword;

    private String msex;

    private Date mage;

    private String mbuildnum;

    private String mdrom;

    private String mcollege;

    private String mmajor;

    private String mtel;

    private String mparenttel;

    private String mpicture;

    private String maddress;

    private Date mdate;

    private String mstate;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMstuid() {
        return mstuid;
    }

    public void setMstuid(String mstuid) {
        this.mstuid = mstuid == null ? null : mstuid.trim();
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMpassword() {
        return mpassword;
    }

    public void setMpassword(String mpassword) {
        this.mpassword = mpassword == null ? null : mpassword.trim();
    }

    public String getMsex() {
        return msex;
    }

    public void setMsex(String msex) {
        this.msex = msex == null ? null : msex.trim();
    }

    public Date getMage() {
        return mage;
    }

    public void setMage(Date mage) {
        this.mage = mage;
    }

    public String getMbuildnum() {
        return mbuildnum;
    }

    public void setMbuildnum(String mbuildnum) {
        this.mbuildnum = mbuildnum == null ? null : mbuildnum.trim();
    }

    public String getMdrom() {
        return mdrom;
    }

    public void setMdrom(String mdrom) {
        this.mdrom = mdrom == null ? null : mdrom.trim();
    }

    public String getMcollege() {
        return mcollege;
    }

    public void setMcollege(String mcollege) {
        this.mcollege = mcollege == null ? null : mcollege.trim();
    }

    public String getMmajor() {
        return mmajor;
    }

    public void setMmajor(String mmajor) {
        this.mmajor = mmajor == null ? null : mmajor.trim();
    }

    public String getMtel() {
        return mtel;
    }

    public void setMtel(String mtel) {
        this.mtel = mtel == null ? null : mtel.trim();
    }

    public String getMparenttel() {
        return mparenttel;
    }

    public void setMparenttel(String mparenttel) {
        this.mparenttel = mparenttel == null ? null : mparenttel.trim();
    }

    public String getMpicture() {
        return mpicture;
    }

    public void setMpicture(String mpicture) {
        this.mpicture = mpicture == null ? null : mpicture.trim();
    }

    public String getMaddress() {
        return maddress;
    }

    public void setMaddress(String maddress) {
        this.maddress = maddress == null ? null : maddress.trim();
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    public String getMstate() {
        return mstate;
    }

    public void setMstate(String mstate) {
        this.mstate = mstate == null ? null : mstate.trim();
    }
}