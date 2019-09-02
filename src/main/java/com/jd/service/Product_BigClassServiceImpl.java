package com.jd.service;

import com.jd.enity.Product_BigClass;
import com.jd.enity.Product_SmallClass;
import com.jd.mapper.Product_BigClassMapper;
import com.jd.mapper.Product_SmallClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Product_BigClassServiceImpl implements Product_BigClassService {
    @Autowired
    Product_BigClassMapper product_bigClassMapper;
    @Autowired
    Product_SmallClassMapper product_smallClassMapper;
    @Override//获取所有一级商品大类信息
    public List<Product_BigClass> getallBigClass() {
        List<Product_BigClass> p_all=product_bigClassMapper.getallBigClass();
        return p_all;
    }

    @Override//添加一条大类数据  传入一个数据对象
    public boolean add_firstBigClass(Product_BigClass a_kind) {
        int succ=product_bigClassMapper.insert(a_kind);
        if(succ==0)return false;
        return true;
    }

    @Override//删除一条大类数据  传入一个对象id
    public boolean del_firstBigClass(Integer del) {
        int have_small= product_smallClassMapper.Big_have_Small(del);
        if(have_small==0){
            product_bigClassMapper.deleteByPrimaryKey(del);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int alter_firstBigClass(Product_BigClass a_kind) {
        if(product_bigClassMapper.updateByPrimaryKeySelective(a_kind)==1) {
            return 1;
        }else{
            return 2;
        }
    }
}
