package com.bbd.pm.org.service.impl;

import com.bbd.pm.common.entities.user.User;
import com.bbd.pm.org.dao.UserDao;
import com.bbd.pm.org.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Date: 2019/1/25 10:11
 * @Auther: lynn
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public boolean addUser(User user) {
        userDao.insert(user);
        return true;
//        return userDao.addUser(user);
    }

    @Override
    public User findById(String id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
