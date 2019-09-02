package com.jd.service;

import com.jd.enity.Address_City;
import org.springframework.stereotype.Service;

import java.util.List;


public interface Address_CityService {
    public List<Address_City> getAllCity();
    public List<Address_City> getCity(int a_pid);
}
