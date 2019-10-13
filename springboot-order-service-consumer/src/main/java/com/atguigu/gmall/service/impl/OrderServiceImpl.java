package com.atguigu.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;


    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("---------------消费者消费--------------");
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);

        return userAddressList;
    }
}
