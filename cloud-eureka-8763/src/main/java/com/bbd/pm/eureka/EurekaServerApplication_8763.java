package com.bbd.pm.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:
 * @Date: 2019/1/17 16:40
 * @Auther: lynn
 */
@SpringBootApplication
@EnableEurekaServer //EurekaServer服务端启动类，接受其它微服务注册进来
public class EurekaServerApplication_8763 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication_8763.class);
        System.out.println();
    }
}
