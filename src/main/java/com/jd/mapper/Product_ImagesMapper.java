package com.jd.mapper;

import com.jd.enity.Product_Images;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Product_ImagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product_Images record);

    int insertSelective(Product_Images record);

    Product_Images selectByPrimaryKey(Integer id);

    List<Product_Images> getImgByProId(Integer id);

    int updateByPrimaryKeySelective(Product_Images record);

    int updateByPrimaryKey(Product_Images record);
}