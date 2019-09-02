package com.jd.mapper;

import com.jd.enity.Order_Status;

public interface Order_StatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order_Status record);

    int insertSelective(Order_Status record);

    Order_Status selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order_Status record);

    int updateByPrimaryKey(Order_Status record);
}