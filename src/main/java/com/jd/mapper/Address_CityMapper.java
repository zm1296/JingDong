package com.jd.mapper;

import com.jd.enity.Address_City;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Address_CityMapper {
    List<Address_City> getAllCity();

    List<Address_City> getCity(Integer a_pid);

    int deleteByPrimaryKey(Integer a_cid);

    int insert(Address_City record);

    int insertSelective(Address_City record);

    Address_City selectByPrimaryKey(Integer a_cid);

    int updateByPrimaryKeySelective(Address_City record);

    int updateByPrimaryKey(Address_City record);
}