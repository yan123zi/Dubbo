package com.pxxy.service.impl;

import com.pxxy.bean.UserAddress;
import com.pxxy.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author YZJ
 * @date 2019/4/7 - 14:52
 */
public class UserServiceImpl02 implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("new 2.0.0");
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼4层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦A座4层（深圳分校）", "1", "王老师", "010-56253825", "N");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Arrays.asList(address1,address2);
    }
}
