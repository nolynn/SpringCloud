package com.bbd.pm.org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Date: 2019/1/21 09:38
 * @Auther: lynn
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ProviderOrgApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderOrgApplication.class);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home() {
        return "hello world eureka port:" + port;
    }
}
