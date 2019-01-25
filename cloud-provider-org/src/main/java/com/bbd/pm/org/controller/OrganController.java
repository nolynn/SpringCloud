package com.bbd.pm.org.controller;

import com.bbd.pm.common.entities.BaseResponse;
import com.bbd.pm.common.entities.user.User;
import com.bbd.pm.org.service.UserService;
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

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public BaseResponse findById(@PathVariable String id) {
        System.out.println(this.restTemplate.getForObject("http://localhost:8001/form/" + id, BaseResponse.class));
        return this.restTemplate.getForObject("http://localhost:8001/form/" + id, BaseResponse.class);
    }

    @GetMapping("/userInstance")
    public List<ServiceInstance> showInfo() {
        return this.discoveryClient.getInstances("cloud-provider-user");
    }

    @GetMapping("/user/detail/{id}")
    public BaseResponse<User> detail(@PathVariable String id) {
        BaseResponse<User> result = new BaseResponse<>();
        try {
            User user = userService.findById(id);
            result.setSuccess(true);
            result.setData(user);
            result.setTotalCount(1);
        } catch (Exception ex) {
            result.setSuccess(false);
            result.setErrMsg(ex.getMessage());
            ex.printStackTrace();
        }
        return result;
    }

    @GetMapping("/user/list")
    public BaseResponse<User> list() {
        BaseResponse result = new BaseResponse<>();
        try {
            List<User> list = userService.findAll();
            result.setSuccess(true).setData(list).setTotalCount(1);
        } catch (Exception ex) {
            ex.printStackTrace();
            result.setSuccess(false).setLogAndErrMsg(ex.getMessage());
        }
        return result;
    }
}
