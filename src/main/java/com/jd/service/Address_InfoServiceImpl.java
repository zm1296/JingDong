package com.jd.service;

import com.jd.enity.Address_Info;
import com.jd.mapper.Address_InfoMapper;
import com.jd.mapper.User_InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Address_InfoServiceImpl implements Address_InfoService {

    @Autowired
    Address_InfoMapper address_infoMapper;
    @Autowired
    User_InfoMapper user_infoMapper;

    @Override
    public List<Address_Info> getAllAddressByUserId(int id) {
        return address_infoMapper.selectByUserId(id);
    }

    @Override
    public int insertAddress_info(Address_Info address_info) {
        int index=address_infoMapper.insert(address_info);
          List<Address_Info> a=address_infoMapper.selectAddress(address_info.getPhone());
          if(index>0)
          {
              int b=user_infoMapper.updateaddress_id(a.get(0).getId(),a.get(0).getPhone());

              return index;

          }else
          {
              return -1;
          }






    }
}
