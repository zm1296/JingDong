package com.jd.service;

import com.jd.enity.User_ShopCart;
import com.jd.mapper.User_ShopCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopCartServiceImpl implements ShopCartService {
    @Autowired
    User_ShopCartMapper user_shopCartMapper;

    @Override
    public List<User_ShopCart> getAllShopCart(Integer user_id) {
        return user_shopCartMapper.getAllShopCart(user_id);
    }

    @Override
    public void cartDel(Integer id) {

        user_shopCartMapper.cartDel(id);
    }

    @Override
    public Integer getProAdd(List<User_ShopCart> id) {
        for (User_ShopCart temp: id){
//            cartMapper.insert(temp);
            user_shopCartMapper.updateByPrimaryKeySelective(temp);
        }
        return 1;
    }

    @Override
    public int insertShopCart(User_ShopCart record) {
        return user_shopCartMapper.insertSelective(record);
    }
//    @Override
//    public void toGenerate(List<Integer> list, Integer user_id) {
//        user_shopCartMapper.toGenerate(list, user_id);
//    }
}
