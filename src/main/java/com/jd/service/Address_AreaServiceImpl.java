package com.jd.service;

import com.jd.enity.Address_Area;
import com.jd.mapper.Address_AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Address_AreaServiceImpl implements Address_AreaService{
    @Autowired
    Address_AreaMapper area;
    @Override
    public List<Address_Area> getArea(int a_c_id) {
        return area.getArea(a_c_id);
    }
}
