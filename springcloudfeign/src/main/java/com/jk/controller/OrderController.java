package com.jk.controller;

import com.jk.entity.Order;
import com.jk.service.OrderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("app/order")
public class OrderController {

    @Autowired
    private OrderFeignService orderFeignService;

    @Value("${server.port}")
    private String port ;

    @GetMapping("{orderId}")
    public Order queryOrderById(@PathVariable("orderId") String orderId){
        String s = orderFeignService.queryOrderById(orderId);
        System.out.println("端口号为 = [" + port + "]");
        return null;
    }

    @PostMapping
    public void addOrderInfo(@RequestBody Order order){
        orderFeignService.addOrderInfo(order);
    }

    @PutMapping
    public void updateOrder(@RequestBody Order order){
        orderFeignService.updateOrder(order);
    }

    @DeleteMapping("{orderId}")
    public void deleteOrder(@PathVariable("orderId") String orderId){
        orderFeignService.deleteOrder(orderId);
    }

}
