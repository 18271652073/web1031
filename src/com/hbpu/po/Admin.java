package com.hbpu.po;

public class Admin {
    private Integer id;

    private String username;

    private String password;

    private String mgpower;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMgpower() {
        return mgpower;
    }

    public void setMgpower(String mgpower) {
        this.mgpower = mgpower == null ? null : mgpower.trim();
    }
}