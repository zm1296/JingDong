package com.jd.service;

import com.jd.enity.Address_Province;
import com.jd.mapper.Address_ProvinceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Address_ProvinceServiceImpl implements Address_ProvinceService{
    @Autowired
    Address_ProvinceMapper province;
    @Override
    public List<Address_Province> getALlProvince() {
        return province.getAllProvince();
    }
}
