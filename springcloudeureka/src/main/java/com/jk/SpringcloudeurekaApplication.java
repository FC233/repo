package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//声明当前启动类为eureka注册中心服务
public class SpringcloudeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudeurekaApplication.class, args);
    }
}
