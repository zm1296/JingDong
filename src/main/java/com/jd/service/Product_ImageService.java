package com.jd.service;

import com.jd.enity.Product_Images;

import java.util.List;

public interface Product_ImageService {
    public List<Product_Images> getImgByProId(Integer id);
}
