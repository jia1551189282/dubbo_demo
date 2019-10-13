package com.atguigu.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class OrderServiceApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplicaiton.class,args);
    }
}
