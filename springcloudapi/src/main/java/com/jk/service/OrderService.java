package com.jk.service;

import com.jk.entity.Order;
import org.springframework.web.bind.annotation.*;

@RequestMapping("order")
public interface OrderService {

    @GetMapping("{orderId}")
    String queryOrderById(@PathVariable("orderId") String orderId);

    @PostMapping
    void addOrderInfo(@RequestBody Order order);

    @PutMapping
    void updateOrder(@RequestBody Order order);

    @DeleteMapping("{orderId}")
    String deleteOrder(@PathVariable("orderId") String orderId);

}
