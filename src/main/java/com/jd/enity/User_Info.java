package com.jd.enity;

import java.util.Date;

public class User_Info {
    @Override
    public String toString() {
        return "User_Info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", idcard='" + idcard + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", vip=" + vip +
                ", create_date=" + create_date +
                ", status=" + status +
                ", defaultaddress='" + defaultaddress + '\'' +
                '}';
    }

    private Integer id;

    private String name;

    private String email;

    private String phone;

    private String password;

    private String idcard;

    private Date birthday;

    private String sex;

    private Integer vip;

    private Date create_date;

    private Integer status;

    private String defaultaddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDefaultaddress() {
        return defaultaddress;
    }

    public void setDefaultaddress(String defaultaddress) {
        this.defaultaddress = defaultaddress == null ? null : defaultaddress.trim();
    }
}