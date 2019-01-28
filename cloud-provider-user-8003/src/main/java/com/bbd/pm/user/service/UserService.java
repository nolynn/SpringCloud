package com.bbd.pm.user.service;

import com.bbd.pm.common.entities.user.User;

import java.util.List;

/**
 * @Description:
 * @Date: 2019/1/25 10:11
 * @Auther: lynn
 */
public interface UserService {
    void addUser(User dept);

    User findById(String id);

    List<User> findAll();
}
