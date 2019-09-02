package com.jd.controller;

import com.jd.enity.*;
import com.jd.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ResponseBody
public class BackstageController {
    @Autowired
    Product_BigClassService product_bigClassService;
    @Autowired
    Product_SmallClassService product_smallClassService;
    @Autowired
    Product_InfoService productInfoService;
    @Autowired
    UserService userService;
    @Autowired
    Order_InfoService order_infoService;
    //大类
    @RequestMapping("/backstage_getBigClass")
    public List<Product_BigClass> getAllBigClass(){
        return product_bigClassService.getallBigClass();
    }
    @RequestMapping("/backstage_add_firstBigClass")
    public boolean add_firstBigClass(Product_BigClass a_kind){
//        System.out.println(a_kind);
        return product_bigClassService.add_firstBigClass(a_kind);
    }
    @RequestMapping("/backstage_del_firstBigClass")
    public boolean del_firstBigClass(int del){
        return product_bigClassService.del_firstBigClass(del);
    }
    @RequestMapping("/backstage_alter_firstBigClass")  //修改
    public int alter_firstBigClass(Product_BigClass a_kind){
        System.out.println(a_kind);
        return  product_bigClassService.alter_firstBigClass(a_kind);

    }
    //小类
    @RequestMapping("/backstage_getSmallClass")
    public List<Product_SmallClass> getAllSmallClass(){
        return product_smallClassService.getALL();
    }
    @RequestMapping("/backstage_del_SmallClass")
    public boolean del_SmallClass(int del){    //有问题
        //return product_smallClassService.del_SmallClass(del);
    return false;
    }
    @RequestMapping("/backstage_add_SmallClass")
    public boolean add_SmallClass(Product_SmallClass a_kind){
//        System.out.println(a_kind);
        return product_smallClassService.add_SmallClass(a_kind);
    }
    //商品信息
    @RequestMapping("/backstage_getAllProductInfo")
    public List<Product_Info> getAllProductInfo(){
    return  productInfoService.getAll();
    }
    @RequestMapping("/backstage_del_ProductInfo")
    public boolean del_ProductInfo(int del){
        return productInfoService.del_ProductInfo(del);
    }
    @RequestMapping("/backstage_add_ProductInfo")   //传不进小对象*************
    public boolean add_ProductInfo(Product_Info change){
        System.out.println(change);
        return true;
    }
    @RequestMapping("/backstage_alter_ProductInfo")
    public boolean alter_ProductInfo(Product_Info change){
        return true;
    }

    //订单信息
    @RequestMapping("/backstage_getAllOrder")
    public List<Order_Info>getAllOrder(){
        return order_infoService.getAllOrder();
    }

    //用户信息
    @RequestMapping("/backstage_getAllUser")
    public List<User_Info>getAllUser(){
        return userService.getAllUser();
    }
    @RequestMapping("/backstage_add_User")
    public boolean add_User(User_Info add){
        return userService.add_user(add);
    }
    @RequestMapping("/backstage_del_User")
    public boolean del_User(int del){
        return userService.del_user(del);
    }
}
