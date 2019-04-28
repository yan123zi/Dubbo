package com.pxxy.bootorderserviceconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pxxy.bean.UserAddress;
import com.pxxy.service.OrderService;
import com.pxxy.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YZJ
 * @date 2019/4/7 - 15:04
 */

@Service
public class OrderServiceImpl implements OrderService {
    @Reference(loadbalance = "random",timeout = 1000)/*(url = "127.0.0.1:20882")*///dubbo直连
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        //1,查询用户的收货地址
        System.out.println("用户id"+userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);
//        System.out.println(addressList);
//        for (UserAddress userAddress:addressList) {
//            System.out.println(userAddress);
//        }
        return addressList;
    }
}
