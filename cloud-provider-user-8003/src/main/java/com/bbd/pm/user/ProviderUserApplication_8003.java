package com.bbd.pm.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @Date: 2019/1/17 16:40
 * @Auther: lynn
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderUserApplication_8003 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication_8003.class);
    }
}
