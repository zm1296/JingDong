package com.jd.enity;

public class Address_Province {
    private Integer a_pid;

    private String a_pname;

    public Integer getA_pid() {
        return a_pid;
    }

    public void setA_pid(Integer a_pid) {
        this.a_pid = a_pid;
    }

    public String getA_pname() {
        return a_pname;
    }

    public void setA_pname(String a_pname) {
        this.a_pname = a_pname == null ? null : a_pname.trim();
    }
}