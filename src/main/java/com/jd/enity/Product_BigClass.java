package com.jd.enity;

import java.util.Set;

public class Product_BigClass {

    private Integer id;

    private String name;

    private Set<Product_Info> product_infoSet;

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

    public Set<Product_Info> getProduct_infoSet() {
        return product_infoSet;
    }

    public void setProduct_infoSet(Set<Product_Info> product_infoSet) {
        this.product_infoSet = product_infoSet;
    }

    @Override
    public String toString() {
        return "Product_BigClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", product_infoSet=" + product_infoSet +
                '}';
    }
}