package com.jd.mapper;

import com.jd.enity.Address_Area;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Address_AreaMapper {
//    int deleteByPrimaryKey(Integer a_areaid);
      List<Address_Area> getArea(Integer a_c_id);
//    int insert(Address_Area record);
//
//    int insertSelective(Address_Area record);
//
//    Address_Area selectByPrimaryKey(Integer a_areaid);
//
//    int updateByPrimaryKeySelective(Address_Area record);
//
//    int updateByPrimaryKey(Address_Area record);
}