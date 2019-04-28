package com.pxxy.service;

import com.pxxy.bean.UserAddress;

import java.util.List;

/**
 * @author YZJ
 * @date 2019/4/7 - 14:50
 */
public interface UserService {
    /**
     * 按照用户id返回所有的收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
