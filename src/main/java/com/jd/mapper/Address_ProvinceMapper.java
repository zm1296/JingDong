package com.jd.mapper;

import com.jd.enity.Address_Province;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Address_ProvinceMapper {

    List<Address_Province> getAllProvince();





    int deleteByPrimaryKey(Integer a_pid);

    int insert(Address_Province record);

    int insertSelective(Address_Province record);

    Address_Province selectByPrimaryKey(Integer a_pid);

    int updateByPrimaryKeySelective(Address_Province record);

    int updateByPrimaryKey(Address_Province record);
}