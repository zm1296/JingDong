package com.jd.service;

import com.jd.enity.Product_Images;
import com.jd.mapper.Product_ImagesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Product_ImageServiceImpl implements Product_ImageService {
    @Autowired
    Product_ImagesMapper product_imagesMapper;

    @Override
    public List<Product_Images> getImgByProId(Integer id) {
        return product_imagesMapper.getImgByProId(id);
    }
}
