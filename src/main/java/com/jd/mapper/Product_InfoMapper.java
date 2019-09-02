package com.jd.mapper;

import com.jd.enity.Product_Info;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Product_InfoMapper {
    List<Product_Info> getAll();
    int deleteByPrimaryKey(Integer id);

    int insert(Product_Info record);

    int insertSelective(Product_Info record);

    Product_Info selectByPrimaryKey(Integer id);

    List<Product_Info> getComment(Integer id);

    List<Product_Info> selectPInfoByKey(String key);


    int updateByPrimaryKeySelective(Product_Info record);

    int updateByPrimaryKey(Product_Info record);
}