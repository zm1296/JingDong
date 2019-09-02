package com.jd.controller;

import com.jd.enity.Address_Province;
import com.jd.enity.User_Info;
import com.jd.service.ProvinceServince;
import com.jd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProvinceController {

    @Autowired
    ProvinceServince provinceServince;

    @RequestMapping("/api/address/province")
    public List<Address_Province> getAllProvince(){
        List<Address_Province> list = new ArrayList<Address_Province>();
        list = provinceServince.getAllProvince();
        for(int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        return provinceServince.getAllProvince();
    }

}
