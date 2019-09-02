package com.jd.enity;

import java.util.Set;

public class Product_SmallClass {
    private Integer id;

    private String name;

    private Integer bigclass_id;

    private Set<Product_Info> product_infoset;

    @Override
    public String toString() {
        return "Product_SmallClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bigclass_id=" + bigclass_id +
                ", product_infoset=" + product_infoset +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Set<Product_Info> getProduct_infoset() {
        return product_infoset;
    }

    public void setProduct_infoset(Set<Product_Info> product_infoset) {
        this.product_infoset = product_infoset;
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

    public Integer getBigclass_id() {
        return bigclass_id;
    }

    public void setBigclass_id(Integer bigclass_id) {
        this.bigclass_id = bigclass_id;
    }
}