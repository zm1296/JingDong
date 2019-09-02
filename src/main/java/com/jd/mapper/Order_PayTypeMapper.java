package com.jd.mapper;

import com.jd.enity.Order_PayType;

public interface Order_PayTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order_PayType record);

    int insertSelective(Order_PayType record);

    Order_PayType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order_PayType record);

    int updateByPrimaryKey(Order_PayType record);
}