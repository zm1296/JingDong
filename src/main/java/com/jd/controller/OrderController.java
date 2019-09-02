package com.jd.controller;

import com.jd.enity.*;
import com.jd.mapper.User_ShopCartMapper;
import com.jd.service.Address_InfoService;
import com.jd.service.Order_InfoService;
import com.jd.service.Product_VersionService;
import com.jd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    Product_VersionService product_versionService;
    @Autowired
    Address_InfoService address_infoService;
    @Autowired
    UserService userService;
    @Autowired
    Order_InfoService order_infoService;

    @RequestMapping("/api/order/commit/info")
    public List<User_ShopCart> shopcartCommit(int userid){
        //提交参数为用户id，返回值为购物车待结算信息(附带商品信息和图片)
        System.out.println("debug1");
        return product_versionService.getPVersionById(userid);
    }
    @RequestMapping("/api/order/commit/img")
    public List<String> shopCartCommitGetImgUrl(){
        //提交参数为购物车id列表，返回值为商品图片URL
        List<Integer> test = new ArrayList<>();
        test.add(1);
        return product_versionService.getImgUrlByID(test);
    }
    @RequestMapping("/api/order/commit/address")
    public Address_Info getAddressByUserId(int id){
        //提交值为userid,返回值为地址信息列表
        return address_infoService.getAllAddressByUserId(id).get(1);
    }
    @RequestMapping("/api/getUserInfo")
    public User_Info getUserInfo(int id){
        return userService.getUserInfo(id);
    }
    @RequestMapping("/api/order/createOrder")
    public int createOrder(@RequestBody Order_Info order_info){
        //插入一条订单信息。
        int m = order_infoService.createOrder(order_info);
        System.out.println(m);
        return m;
    }
    @RequestMapping("/api/order/createOrderItem")
    public boolean createOrderItem(@RequestBody Order_Item order_item){
        //插入一条订单物品信息
        return order_infoService.createOrderItem(order_item);
    }
    @RequestMapping("/api/order/deleteShopCart")
    public int deleteShopCart(int userid){
        return order_infoService.deleteShopCart(userid);
    }
}
