package com.jd.service;

import com.jd.enity.User_ShopCart;

import java.util.List;

public interface ShopCartService {
    public List<User_ShopCart> getAllShopCart(Integer user_id);
    public void cartDel(Integer id);
    public Integer getProAdd(List<User_ShopCart> id);
//    public void toGenerate(List<Integer> list, Integer user_id);

    public int insertShopCart(User_ShopCart record);
}
