package com.pxxy.service.impl;

import com.pxxy.bean.UserAddress;
import com.pxxy.service.OrderService;
import com.pxxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YZJ
 * @date 2019/4/7 - 15:04
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        //1,查询用户的收货地址
        System.out.println("用户id"+userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);
//        System.out.println(addressList);
        for (UserAddress userAddress:addressList) {
            System.out.println(userAddress);
        }
        return addressList;
    }
}
