package com.jk.controller;

import com.jk.entity.Order;
import com.jk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController implements OrderService {

    @Autowired
    private OrderService orderService;

    @Override
    public String queryOrderById(String orderId) {
        String orderid = "sdsd";
        orderId = orderid;
        System.out.println("orderId为 = [" + orderId + "]");
        try {
            Thread.sleep(200000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("接受到查询请求");
        return null;
    }

    @Override
    public void addOrderInfo(Order order) {
        System.out.println("接收到新增请求");
    }

    @Override
    public void updateOrder(Order order) {
        System.out.println("接受到修改请求");
    }

    @Override
    public String deleteOrder(String orderId) {
        System.out.println("接受到删除请求");
        return null;
    }
}
