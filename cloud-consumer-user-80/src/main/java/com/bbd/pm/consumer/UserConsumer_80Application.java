package com.bbd.pm.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @Date: 2019/1/28 10:37
 * @Auther: lynn
 */
@SpringBootApplication
@EnableEurekaClient
public class UserConsumer_80Application {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumer_80Application.class, args);
    }
}
