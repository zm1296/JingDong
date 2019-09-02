package com.jd.mapper;

import com.jd.enity.Product_Version;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Product_VersionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product_Version record);

    int insertSelective(Product_Version record);

    Product_Version selectByPrimaryKey(Integer id);

    List<Product_Version> getProductVersion(Integer id);

    int updateByPrimaryKeySelective(Product_Version record);

    int updateByPrimaryKey(Product_Version record);
}