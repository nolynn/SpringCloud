package com.bbd.pm.user.controller;

import com.bbd.pm.common.entities.BaseResponse;
import com.bbd.pm.common.entities.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Date: 2019/1/21 10:13
 * @Auther: lynn
 */
@RestController
public class UserController {
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/form/{id}")
    public BaseResponse<User> form(@PathVariable String id) {
        BaseResponse<User> result = new BaseResponse<>();
        if (id.equals("1")) {
            result.setSuccess(true);
            result.setData(new User(id, "zhangk", "123456", "张凯"));
            return result;
        }
        return result;
    }

    @GetMapping("/organInstance")
    public List<ServiceInstance> organInstance() {
        return discoveryClient.getInstances("cloud-provider-org");
    }
}
