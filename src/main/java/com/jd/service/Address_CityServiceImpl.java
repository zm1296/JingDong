package com.jd.service;

import com.jd.enity.Address_City;
import com.jd.mapper.Address_CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Address_CityServiceImpl implements Address_CityService{
    @Autowired
    Address_CityMapper cityMapper;
    @Override
    public List<Address_City> getAllCity() {
        return cityMapper.getAllCity();
    }

    @Override
    public List<Address_City> getCity(int a_pid) {
        return cityMapper.getCity(a_pid);
    }
}
