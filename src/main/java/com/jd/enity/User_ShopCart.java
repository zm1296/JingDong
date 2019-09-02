package com.jd.enity;

public class User_ShopCart {
    private Integer id;

    private Integer user_id;

    private Integer produce_id;

    private Product_Info product_info;

    private Product_Version product_version;

    private Integer pversion_id;

    private Integer amount;

    @Override
    public String toString() {
        return "User_ShopCart{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", produce_id=" + produce_id +
                ", product_info=" + product_info +
                ", product_version=" + product_version +
                ", pversion_id=" + pversion_id +
                ", amount=" + amount +
                '}';
    }

    public Product_Info getProduct_info() {
        return product_info;
    }

    public void setProduct_info(Product_Info product_info) {
        this.product_info = product_info;
    }

    public Product_Version getProduct_version() {
        return product_version;
    }

    public void setProduct_version(Product_Version product_version) {
        this.product_version = product_version;
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

    public Integer getProduce_id() {
        return produce_id;
    }

    public void setProduce_id(Integer produce_id) {
        this.produce_id = produce_id;
    }

    public Integer getPversion_id() {
        return pversion_id;
    }

    public void setPversion_id(Integer pversion_id) {
        this.pversion_id = pversion_id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}