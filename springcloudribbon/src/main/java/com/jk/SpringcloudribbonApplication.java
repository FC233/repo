package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现注解 从eureka获取生产者存入的ip和端口
public class SpringcloudribbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudribbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
//注入一个restTemplate 模板调用类 通过restTemplate调用springcloud接口
        //默认负载策略为轮询
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
