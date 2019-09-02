package com.jd.service;

import com.jd.enity.Order_Info;
import com.jd.enity.Order_Item;
import com.jd.mapper.Order_InfoMapper;
import com.jd.mapper.Order_ItemMapper;
import com.jd.mapper.User_ShopCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Order_InfoServiceImpl implements Order_InfoService {

    @Autowired
    Order_InfoMapper order_infoMapper;
    @Autowired
    Order_ItemMapper order_itemMapper;
    @Autowired
    User_ShopCartMapper user_shopCartMapper;

    @Override
    public int createOrder(Order_Info order_info) {
        int i = order_infoMapper.insert(order_info);
        if(i == 1){
            int m = order_infoMapper.getLatestId();
            return m;
        }else{
            return 0;
        }
    }

    @Override
    public boolean createOrderItem(Order_Item order_item) {
        int i =  order_itemMapper.insert(order_item);
        if(i == 1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int deleteShopCart(int userid) {
        return user_shopCartMapper.deleteShopCartByStatus(userid);}
    @Override
    public List<Order_Info> getAllOrder() {
        return order_infoMapper.getAllOrder();
    }
}
