package com.jd.service;

import com.jd.enity.Product_SmallClass;

import java.util.List;

public interface Product_SmallClassService {
    List<Product_SmallClass> getALL();
    boolean del_SmallClass(int del);
    boolean add_SmallClass(Product_SmallClass a_kind);
}
