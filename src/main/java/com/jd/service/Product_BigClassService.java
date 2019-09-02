package com.jd.service;

import com.jd.enity.Product_BigClass;

import java.util.List;

public interface Product_BigClassService {
    public List<Product_BigClass> getallBigClass();
    public boolean add_firstBigClass (Product_BigClass a_kind);
    public boolean del_firstBigClass(Integer del);
    public int alter_firstBigClass(Product_BigClass a_kind);
}
