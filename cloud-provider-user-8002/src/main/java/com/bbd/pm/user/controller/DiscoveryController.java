package com.bbd.pm.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Date: 2019/1/23 14:48
 * @Auther: lynn
 */
@RestController
public class DiscoveryController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        System.out.println("******" + services);

        return this.discoveryClient;
    }

}
