package com.bbd.pm.org;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Date: 2019/1/21 09:38
 * @Auther: lynn
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@MapperScan("com.bbd.pm.org.dao")
public class ProviderOrgApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderOrgApplication.class);
    }

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
