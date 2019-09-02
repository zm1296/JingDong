package com.jd.mapper;

import com.jd.enity.Product_Status;

public interface Product_StatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product_Status record);

    int insertSelective(Product_Status record);

    Product_Status selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product_Status record);

    int updateByPrimaryKey(Product_Status record);
}