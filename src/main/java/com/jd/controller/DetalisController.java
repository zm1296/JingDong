package com.jd.controller;

import com.jd.enity.*;
import com.jd.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DetalisController {
    @Autowired
    Product_InfoService product_infoService;
    @Autowired
    Product_VersionService product_versionService;
    @Autowired
    Product_ImageService product_imageService;
    @Autowired
    Comment_InfoService comment_infoService;
    @Autowired
    ShopCartService shopCartService;

    @RequestMapping("/selOneProDetail")
    public Product_Info selectByPrimaryKey(Integer id) {
        return product_infoService.selectByPrimaryKey(id);
    }

    @RequestMapping("/getProductVersion")
    public List<Product_Version> getProductVersion(Integer id){return product_versionService.getProductVersion(id);}

    @RequestMapping("/getCommentByProId")
    public List<Comment_Info> getCommentByProId(Integer id){
        return comment_infoService.getCommentByProId(id);
    }

    @RequestMapping("/getImgByProId")
    public List<Product_Images> getImgByProId(Integer id) {
        return product_imageService.getImgByProId(id);
    }

    @RequestMapping("/insertShopCart")
    public int insertShopCart(@RequestBody User_ShopCart record) {
        return shopCartService.insertShopCart(record);
    }

}
