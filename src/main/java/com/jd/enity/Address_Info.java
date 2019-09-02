package com.jd.enity;

public class Address_Info {
    private Integer id;

    private Integer user_id;

    private String receiver;

    private Integer zipcode;

    private String phone;
    private int province;
    private int city;
    private int area;
    private Address_Province address_province;
    private Address_City address_city;
    private Address_Area address_area;

    private String address;

    @Override
    public String toString() {
        return "Address_Info{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", receiver='" + receiver + '\'' +
                ", zipcode=" + zipcode +
                ", phone='" + phone + '\'' +
                ", address_province=" + address_province +
                ", address_city=" + address_city +
                ", address_area=" + address_area +
                ", address='" + address + '\'' +
                '}';
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Address_Province getAddress_province() {
        return address_province;
    }

    public void setAddress_province(Address_Province address_province) {
        this.address_province = address_province;
    }

    public Address_City getAddress_city() {
        return address_city;
    }

    public void setAddress_city(Address_City address_city) {
        this.address_city = address_city;
    }

    public Address_Area getAddress_area() {
        return address_area;
    }

    public void setAddress_area(Address_Area address_area) {
        this.address_area = address_area;
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

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}