package com.jd.mapper;

import com.jd.enity.Order_Transport;

public interface Order_TransportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order_Transport record);

    int insertSelective(Order_Transport record);

    Order_Transport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order_Transport record);

    int updateByPrimaryKey(Order_Transport record);
}