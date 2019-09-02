package com.jd.controller;


import com.jd.enity.Product_Info;
import com.jd.service.Product_InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    Product_InfoService product_infoService;

    @RequestMapping("/api/search")
    public List<Product_Info> getPInfoByKey(String key){
        //提交参数为搜索关键字，返回值为商品信息
        return product_infoService.getPInfoByKey(key);
    }
}
