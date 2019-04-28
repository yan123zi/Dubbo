package com.pxxy.service.impl;

import com.pxxy.bean.UserAddress;
import com.pxxy.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author YZJ
 * @date 2019/4/8 - 20:09
 */
public class UserServiceStub implements UserService {
    private final UserService userService;

    /**
     * 传入的是userService的远程代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        super();
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceStub");
        if(!StringUtils.isEmpty(userId)){
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
