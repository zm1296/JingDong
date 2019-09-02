package com.jd.service;

import com.jd.enity.Product_Images;
import com.jd.enity.Product_Version;
import com.jd.enity.User_ShopCart;
import com.jd.mapper.Product_ImagesMapper;
import com.jd.mapper.Product_VersionMapper;
import com.jd.mapper.User_ShopCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Product_VersionServiceImpl implements Product_VersionService {

    @Autowired
    Product_VersionMapper product_versionMapper;
    @Autowired
    User_ShopCartMapper user_shopCartMapper;
    @Autowired
    Product_ImagesMapper product_imagesMapper;

    @Override
    public List<User_ShopCart> getPVersionById(int userid) {
        //参数为购物车id的列表，先获得商品版本列表
        List<User_ShopCart> vlist = new ArrayList<>();
//        for(int i = 0; i<list.size(); i++){
//            User_ShopCart temp = user_shopCartMapper.selectByPrimaryKey(list.get(i));
//             vlist.add(temp);
//        }
        vlist = user_shopCartMapper.getShopCartByUserId(userid);

//        System.out.println(vlist.get(0));
//
//        List<Product_Version> Plist = new ArrayList<Product_Version>();
//        for (int i = 0; i<vlist.size(); i++){
//            Product_Version temp =  product_versionMapper.selectByPrimaryKey(vlist.get(i).getPversion_id());
//            Plist.add(temp);
//        }
        return vlist;
    }

    @Override
    public List<String> getImgUrlByID(List<Integer> list) {
        //参数为购物车id的列表，先获得商品id列表
        List<User_ShopCart> vlist = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
            User_ShopCart temp = user_shopCartMapper.selectByPrimaryKey(list.get(i));
            vlist.add(temp);
        }
        List<String> Plist = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
            Product_Images temp = product_imagesMapper.selectByPrimaryKey(vlist.get(i).getProduce_id());
            Plist.add(temp.getUrl());
        }
        return Plist;
    }

    @Override
    public List<Product_Version> getProductVersion(Integer id) {
        return product_versionMapper.getProductVersion(id);
    }
}
