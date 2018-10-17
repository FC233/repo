package com.jk.service;

import com.jk.entity.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RequestMapping("error/order")
public class OrderError implements OrderFeignService {

    @Override
    public String queryOrderById(String orderId) {
        return "查询接口出错";
    }

    @Override
    public void addOrderInfo(Order order) {

    }

    @Override
    public void updateOrder(Order order) {

    }

    @Override
    public String deleteOrder(String orderId) {
        return null;
    }
}
