package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //路由代理
public class SpringcloudzuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudzuulApplication.class, args);
    }
}
