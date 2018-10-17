package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-order",fallback = OrderError.class)
public interface OrderFeignService extends OrderService{

}
