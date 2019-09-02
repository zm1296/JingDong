package com.jd.enity;

import java.util.Date;

public class Comment_Info {
    private Integer id;

    private Integer user_id;

    private Integer product_id;

    private Date create_date;

    private Integer score;

    private String content;

    private Product_Info product_info;

    private User_Info user_info;

    public Product_Info getProduct_info() {
        return product_info;
    }

    public void setProduct_info(Product_Info product_info) {
        this.product_info = product_info;
    }

    public User_Info getUser_info() {
        return user_info;
    }

    public void setUser_info(User_Info user_info) {
        this.user_info = user_info;
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

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "Comment_Info{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", product_id=" + product_id +
                ", create_date=" + create_date +
                ", score=" + score +
                ", content='" + content + '\'' +
                ", product_info=" + product_info +
                ", user_info=" + user_info +
                '}';
    }
}