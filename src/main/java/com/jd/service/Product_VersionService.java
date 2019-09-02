package com.jd.service;

import com.jd.enity.Product_Version;
import com.jd.enity.User_ShopCart;

import java.util.List;

public interface Product_VersionService {

    public List<User_ShopCart> getPVersionById(int userid);
    public List<String> getImgUrlByID(List<Integer> list);

    public List<Product_Version> getProductVersion(Integer id);

}
