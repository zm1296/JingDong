package com.jd.mapper;

import com.jd.enity.Product_SmallClass;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Product_SmallClassMapper {
    List<Product_SmallClass> getALL();
    int Small_in_Info(int have);
    int Big_have_Small (Integer have);

    int deleteByPrimaryKey(Integer id);

    int insert(Product_SmallClass record);

    int insertSelective(Product_SmallClass record);

    Product_SmallClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product_SmallClass record);

    int updateByPrimaryKey(Product_SmallClass record);
}