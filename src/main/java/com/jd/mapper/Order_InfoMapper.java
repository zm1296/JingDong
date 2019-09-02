package com.jd.mapper;

import com.jd.enity.Order_Info;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface Order_InfoMapper {
    List<Order_Info>getAllOrder();
    int deleteByPrimaryKey(Integer id);

    int insert(Order_Info record);

    int insertSelective(Order_Info record);

    Order_Info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order_Info record);

    int updateByPrimaryKey(Order_Info record);

    int getLatestId();
}