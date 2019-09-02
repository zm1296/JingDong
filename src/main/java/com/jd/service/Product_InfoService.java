package com.jd.service;

import com.jd.enity.Product_Info;

import java.util.List;

public interface Product_InfoService {
    List<Product_Info> getAll();
    boolean del_ProductInfo(int del);

    public Product_Info selectByPrimaryKey(Integer id);
    List<Product_Info> getComment(Integer id);
    public List<Product_Info> getPInfoByKey(String key);
}
