package com.jd.enity;

public class Address_Area {
    private Integer a_areaid;

    private String a_areaname;

    private Integer a_c_id;

    public Integer getA_areaid() {
        return a_areaid;
    }

    public void setA_areaid(Integer a_areaid) {
        this.a_areaid = a_areaid;
    }

    public String getA_areaname() {
        return a_areaname;
    }

    public void setA_areaname(String a_areaname) {
        this.a_areaname = a_areaname == null ? null : a_areaname.trim();
    }

    public Integer getA_c_id() {
        return a_c_id;
    }

    public void setA_c_id(Integer a_c_id) {
        this.a_c_id = a_c_id;
    }
}