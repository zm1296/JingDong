package com.jd.controller;

import com.jd.enity.User_ShopCart;
import com.jd.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopCartController {
    @Autowired
    ShopCartService shopCartService;
    //查找购物车
    @RequestMapping("/api/cart")
    public List<User_ShopCart> getAllShopCart(Integer user_id){
        List<User_ShopCart> list = shopCartService.getAllShopCart(user_id);
        for (User_ShopCart user_shopCart : list) {
            System.out.println(user_shopCart);
        }
        return shopCartService.getAllShopCart(user_id);
    }
    //移除购物车
    @RequestMapping("/api/cartDel")
    public void cartDel(Integer id){
            shopCartService.cartDel(id);
    }

    //更改购物车数据库数量和状态
    @RequestMapping("/api/order/generate")
    public Integer getProAdd(@RequestBody List<User_ShopCart> id){
        return shopCartService.getProAdd(id);
    }

//    @RequestMapping("/api/order/generate")
//    public void toGenerate(List<Integer> list,Integer user_id){
//         shopCartService.toGenerate(list, user_id);
//    }

}
