package com.jd.mapper;

import com.jd.enity.Product_BigClass;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Product_BigClassMapper {

    List<Product_BigClass> getallBigClass();

    int deleteByPrimaryKey(Integer id);

    int insert(Product_BigClass record);

    int insertSelective(Product_BigClass record);

    Product_BigClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product_BigClass record);

    int updateByPrimaryKey(Product_BigClass record);
}