package com.pxxy.service;

import com.pxxy.bean.UserAddress;

import java.util.List;

/**
 * @author YZJ
 * @date 2019/4/7 - 15:03
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);
}
