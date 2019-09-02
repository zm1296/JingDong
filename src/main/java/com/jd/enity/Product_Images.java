package com.jd.enity;

public class Product_Images {
    private Integer id;

    private Integer product_id;

    private Integer version_id;

    private String url;

    private String descrip;

    private Product_Info product_info;

    @Override
    public String toString() {
        return "Product_Images{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", version_id=" + version_id +
                ", url='" + url + '\'' +
                ", descrip='" + descrip + '\'' +
                ", product_info=" + product_info +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getVersion_id() {
        return version_id;
    }

    public void setVersion_id(Integer version_id) {
        this.version_id = version_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip == null ? null : descrip.trim();
    }

    public Product_Info getProduct_info() {
        return product_info;
    }

    public void setProduct_info(Product_Info product_info) {
        this.product_info = product_info;
    }
}