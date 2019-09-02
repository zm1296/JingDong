package com.jd.enity;

public class Product_Status {
    private Integer id;

    private String name;

    private Product_Info product_info;

    public Product_Info getProduct_info() {
        return product_info;
    }

    public void setProduct_info(Product_Info product_info) {
        this.product_info = product_info;
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
}