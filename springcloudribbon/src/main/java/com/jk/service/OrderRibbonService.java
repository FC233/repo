package com.jk.service;

import com.jk.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderRibbonService {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 根据订单id查询订单详细信息
     * @param orderId 订单id
     * @return  订单对象
     */
    public Order queryOrderById(String orderId){
        //第一个参数为访问httpClient的具体url路径 第二个参数为返回值的类型
        Order order = restTemplate.getForObject("http://service-order/order/" + orderId, Order.class);
        return order;
    }
}
