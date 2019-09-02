package com.jd.enity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Product_Info {
    private Integer id;

    private String name;

    private String title;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date create_time;

    private BigDecimal min_price;

    private String discount;

    private String warranty_data;

    private Integer status_id;

    private Product_Status product_status;
    private Set<Comment_Info> comment_infoSet;

    private Set<Product_Version> product_versionSet;

    public Product_Status getProduct_status() {
        return product_status;
    }

    public void setProduct_status(Product_Status product_status) {
        this.product_status = product_status;
    }

    public Set<Comment_Info> getComment_infoSet() {
        return comment_infoSet;
    }

    public void setComment_infoSet(Set<Comment_Info> comment_infoSet) {
        this.comment_infoSet = comment_infoSet;
    }

    public Set<Product_Version> getProduct_versionSet() {
        return product_versionSet;
    }

    public void setProduct_versionSet(Set<Product_Version> product_versionSet) {
        this.product_versionSet = product_versionSet;
    }

    public Product_BigClass getSid_big() {
        return sid_big;
    }

    public void setSid_big(Product_BigClass sid_big) {
        this.sid_big = sid_big;
    }

    public Product_SmallClass getSid_small() {
        return sid_small;
    }

    public void setSid_small(Product_SmallClass sid_small) {
        this.sid_small = sid_small;
    }

    public int getBig() {
        return big;
    }

    public void setBig(int big) {
        this.big = big;
    }

    public int getSmall() {
        return small;
    }

    public void setSmall(int small) {
        this.small = small;
    }

    private int big;
    private int small;
    private Product_BigClass sid_big;
    private Product_SmallClass sid_small;

    private Product_Images product_images;

    public Product_Images getProduct_images() {
        return product_images;
    }

    public void setProduct_images(Product_Images product_images) {
        this.product_images = product_images;
    }

    @Override
    public String toString() {
        return "Product_Info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", create_time=" + create_time +
                ", min_price=" + min_price +
                ", discount='" + discount + '\'' +
                ", warranty_data='" + warranty_data + '\'' +
                ", status_id=" + status_id +
                ", product_status=" + product_status +
                ", comment_infoSet=" + comment_infoSet +
                ", product_versionSet=" + product_versionSet +
                ", big=" + big +
                ", small=" + small +
                ", sid_big=" + sid_big +
                ", sid_small=" + sid_small +
                ", product_images=" + product_images +
                '}';
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public BigDecimal getMin_price() {
        return min_price;
    }

    public void setMin_price(BigDecimal min_price) {
        this.min_price = min_price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    public String getWarranty_data() {
        return warranty_data;
    }

    public void setWarranty_data(String warranty_data) {
        this.warranty_data = warranty_data;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }
}