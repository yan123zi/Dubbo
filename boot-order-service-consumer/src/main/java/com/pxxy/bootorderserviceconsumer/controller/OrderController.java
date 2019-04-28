package com.pxxy.bootorderserviceconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pxxy.bean.UserAddress;
import com.pxxy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @author YZJ
 * @date 2019/4/7 - 17:01
 */
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    @HystrixCommand(fallbackMethod = "hello")
    @ResponseBody
    @GetMapping("/initOrder/{uid}")
    public List<UserAddress> initOrder(@PathVariable("uid") String userId){
        List<UserAddress> userAddresses = orderService.initOrder(userId);
        return userAddresses;
    }

    public List<UserAddress> hello(String userId){
        System.out.println(userId);
        return Arrays.asList(new UserAddress(10,"测试地址","1","测试 ","测试","测试"));
    }
}
