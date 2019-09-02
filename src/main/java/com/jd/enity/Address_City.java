package com.jd.enity;

public class Address_City {
    private Integer a_cid;

    private String a_cname;

    private Integer a_pid;

    public Integer getA_cid() {
        return a_cid;
    }

    public void setA_cid(Integer a_cid) {
        this.a_cid = a_cid;
    }

    public String getA_cname() {
        return a_cname;
    }

    public void setA_cname(String a_cname) {
        this.a_cname = a_cname == null ? null : a_cname.trim();
    }

    public Integer getA_pid() {
        return a_pid;
    }

    public void setA_pid(Integer a_pid) {
        this.a_pid = a_pid;
    }
}