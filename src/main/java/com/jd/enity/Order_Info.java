package com.jd.enity;

import java.util.Date;

public class Order_Info {
    private Integer id;

    private Integer user_id;

    private Integer address_id;

    private Integer pay_id;

    private Integer status_id;

    private Integer price;

    private Integer transport_id;

    private Date create_date;

    private Date pay_date;

    private Date confirm_date;

    private String remark;

    @Override
    public String toString() {
        return "Order_Info{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", address_id=" + address_id +
                ", pay_id=" + pay_id +
                ", status_id=" + status_id +
                ", price=" + price +
                ", transport_id=" + transport_id +
                ", create_date=" + create_date +
                ", pay_date=" + pay_date +
                ", confirm_date=" + confirm_date +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public Integer getPay_id() {
        return pay_id;
    }

    public void setPay_id(Integer pay_id) {
        this.pay_id = pay_id;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTransport_id() {
        return transport_id;
    }

    public void setTransport_id(Integer transport_id) {
        this.transport_id = transport_id;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getPay_date() {
        return pay_date;
    }

    public void setPay_date(Date pay_date) {
        this.pay_date = pay_date;
    }

    public Date getConfirm_date() {
        return confirm_date;
    }

    public void setConfirm_date(Date confirm_date) {
        this.confirm_date = confirm_date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}