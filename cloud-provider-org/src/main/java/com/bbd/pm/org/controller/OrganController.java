package com.bbd.pm.org.controller;

import com.bbd.pm.common.entities.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description:
 * @Date: 2019/1/21 09:50
 * @Auther: lynn
 */
@RestController
public class OrganController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/user/{id}")
    public BaseResponse findById(@PathVariable String id) {
        System.out.println(this.restTemplate.getForObject("http://localhost:8001/form/" + id, BaseResponse.class));
        return this.restTemplate.getForObject("http://localhost:8001/form/" + id, BaseResponse.class);
    }

    @GetMapping("/userInstance")
    public List<ServiceInstance> showInfo() {
        return this.discoveryClient.getInstances("cloud-provider-user");
    }
}
