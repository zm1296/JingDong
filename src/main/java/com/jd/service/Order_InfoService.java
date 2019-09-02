package com.jd.service;

import com.jd.enity.Order_Info;
import com.jd.enity.Order_Item;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Order_InfoService {
    public int createOrder(Order_Info order_info);
    public boolean createOrderItem(Order_Item order_item);
    public int deleteShopCart(int userid);
    public List<Order_Info> getAllOrder();
}
