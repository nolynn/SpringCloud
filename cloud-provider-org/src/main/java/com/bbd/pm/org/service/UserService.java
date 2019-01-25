package com.bbd.pm.org.service;

import com.bbd.pm.common.entities.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Date: 2019/1/25 10:11
 * @Auther: lynn
 */
public interface UserService {
    boolean addDept(User dept);

    User findById(String id);

    List<User> findAll();
}
