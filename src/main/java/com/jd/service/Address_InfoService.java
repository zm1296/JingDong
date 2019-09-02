package com.jd.service;

import com.jd.enity.Address_Info;
import com.jd.mapper.Address_InfoMapper;

import java.util.List;

public interface Address_InfoService {
    public List<Address_Info> getAllAddressByUserId(int id);
    public int insertAddress_info(Address_Info address_info);
}
