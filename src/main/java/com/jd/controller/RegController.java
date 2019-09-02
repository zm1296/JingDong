package com.jd.controller;

import com.jd.enity.Address_Area;
import com.jd.enity.Address_City;
import com.jd.enity.Address_Info;
import com.jd.enity.Address_Province;
import com.jd.mapper.Address_InfoMapper;
import com.jd.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegController {
    @Autowired
    Address_ProvinceServiceImpl address;
    @Autowired
    Address_CityServiceImpl cityService;
    @Autowired
    Address_AreaServiceImpl area;
    @Autowired
    Address_InfoServiceImpl address_infoService;
    @RequestMapping("/getProvince")
    public List<Address_Province> getProvince()
    {
        return address.getALlProvince();
    }
    @RequestMapping("/getAllCity")
    public List<Address_City> getAllCity()
    {
        return cityService.getAllCity();
    }
    @RequestMapping("/getCity")
    public List<Address_City>getCity(int a_pid)
    {
        return cityService.getCity(a_pid);
    }
    @RequestMapping("/getArea")
    public List<Address_Area> getArea(int a_c_id)
    {
        return area.getArea(a_c_id);
    }
    @RequestMapping("/insertAddress_Info")
    public int insertAddress_Info(Address_Info address_info)
    {

        return address_infoService.insertAddress_info(address_info);
    }
}
