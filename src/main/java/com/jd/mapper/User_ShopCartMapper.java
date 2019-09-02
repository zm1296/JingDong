package com.jd.mapper;

import com.jd.enity.User_ShopCart;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User_ShopCartMapper {
    public List<User_ShopCart> getAllShopCart(Integer user_id);

    public void cartDel(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(User_ShopCart record);

    int insertSelective(User_ShopCart record);

    int insertShopCart(User_ShopCart record);

    User_ShopCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_ShopCart record);

    int updateByPrimaryKey(User_ShopCart record);

    List<User_ShopCart> getShopCartByUserId(int userid);

    int deleteShopCartByStatus(int userid);
}