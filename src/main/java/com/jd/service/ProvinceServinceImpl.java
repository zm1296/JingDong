package com.jd.service;

import com.jd.enity.Address_Province;
import com.jd.mapper.Address_ProvinceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServinceImpl implements ProvinceServince {

    @Autowired
    Address_ProvinceMapper address_provinceMapper;

    @Override
    public List<Address_Province> getAllProvince() {
        return address_provinceMapper.getAllProvince();
    }
}
