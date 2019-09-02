package com.jd.service;

import com.jd.enity.Product_SmallClass;
import com.jd.mapper.Product_InfoMapper;
import com.jd.mapper.Product_SmallClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Product_SmallClassServiceImpl implements Product_SmallClassService {
    @Autowired
    Product_SmallClassMapper product_smallClassMapper;
    @Autowired
    Product_InfoMapper product_infoMapper;

    @Override
    public List<Product_SmallClass> getALL() {
        return product_smallClassMapper.getALL();
    }

    @Override
    public boolean del_SmallClass(int del) {
        int have=product_smallClassMapper.Small_in_Info(del);
        if(have>=1){
            return false;
        }else{
            product_smallClassMapper.deleteByPrimaryKey(del);
            return true;
        }
    }

    @Override  //添加一个小类
    public boolean add_SmallClass(Product_SmallClass a_kind) {
        int result=product_smallClassMapper.insert(a_kind);
        if(result==1)return true;
        return false;
    }
}
