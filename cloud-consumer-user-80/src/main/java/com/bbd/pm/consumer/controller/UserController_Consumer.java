package com.bbd.pm.consumer.controller;

import com.bbd.pm.common.entities.BaseResponse;
import com.bbd.pm.common.entities.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Date: 2019/1/28 10:38
 * @Auther: lynn
 */
@RestController
public class UserController_Consumer {
    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://cloud-provider-user";
    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
     * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/user/add")
    public boolean add(User user) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/user/add", user, Boolean.class);
    }

    @RequestMapping(value = "/consumer/user/get/{id}")
    public User get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/detail/" + id, User.class);
    }

    @RequestMapping(value = "/consumer/user/list")
    public BaseResponse list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/list", BaseResponse.class);
    }

    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/consumer/user/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/discovery", Object.class);
    }

}
