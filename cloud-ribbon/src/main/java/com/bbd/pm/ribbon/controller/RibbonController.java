package com.bbd.pm.ribbon.controller;

import com.bbd.pm.common.entities.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Date: 2019/1/21 11:50
 * @Auther: lynn
 */
@RestController
public class RibbonController {
    Logger logger = LoggerFactory.getLogger(RibbonController.class);

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/user/{id}")
    public BaseResponse findById(@PathVariable String id) {
        return restTemplate.getForObject("http://cloud-provider-user/form/" + id, BaseResponse.class);
    }

    @GetMapping("log-instance")
    public void logUserInstance() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("cloud-provider-user");
        logger.info("{}:{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
    }
}
