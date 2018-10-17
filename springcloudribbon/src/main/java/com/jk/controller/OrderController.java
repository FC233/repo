package com.jk.controller;

import com.jk.entity.Order;
import com.jk.service.OrderRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderRibbonService orderRibbonService;

    @GetMapping("{orderId}")
    public Order queryOrderById(@PathVariable("orderId") String orderId){
        System.out.println("订单id为 = [" + orderId + "]");
        return orderRibbonService.queryOrderById(orderId);
    }
}
