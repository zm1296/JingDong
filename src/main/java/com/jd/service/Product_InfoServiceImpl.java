package com.jd.service;

import com.jd.enity.Product_Info;
import com.jd.mapper.Product_InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Product_InfoServiceImpl implements Product_InfoService {
    @Autowired
    Product_InfoMapper product_infoMapper;
    @Override
    public List<Product_Info> getAll() {
        List<Product_Info> p=product_infoMapper.getAll();
        for(int i=0;i<p.size();i++){
            System.out.println(p.get(i));
        }
//        return product_infoMapper.getAll();
        return p;
    }

    @Override
    public boolean del_ProductInfo(int del) {
        if(product_infoMapper.deleteByPrimaryKey(del)==1)return true;
        return false;
    }

    @Override
    public Product_Info selectByPrimaryKey(Integer id) {
        return product_infoMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<Product_Info> getComment(Integer id) {
        return product_infoMapper.getComment(id);
    }



    @Override
    public List<Product_Info> getPInfoByKey(String key){
        List<Product_Info> plist=  product_infoMapper.selectPInfoByKey(key);
        System.out.println(plist);
        return  plist;
    }

}
