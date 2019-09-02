package com.jd.enity;

import java.math.BigDecimal;

public class Product_Version {
    private Integer id;

    private String name;

    private Product_Info product_info;

    private Integer product_id ;

    private BigDecimal price;

    private Integer stock;

    private BigDecimal purprice;

    private Integer weight;

    @Override
    public String toString() {
        return "Product_Version{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", product_info=" + product_info +
                ", price=" + price +
                ", stock=" + stock +
                ", purprice=" + purprice +
                ", weight=" + weight +
                '}';
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getPurprice() {
        return purprice;
    }

    public void setPurprice(BigDecimal purprice) {
        this.purprice = purprice;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}