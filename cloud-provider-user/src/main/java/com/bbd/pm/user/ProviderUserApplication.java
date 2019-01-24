package com.bbd.pm.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Date: 2019/1/17 16:40
 * @Auther: lynn
 */
@RestController
@SpringBootApplication
@EnableEurekaClient
public class ProviderUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home() {
        return "hello world eureka port:" + port;
    }
}
