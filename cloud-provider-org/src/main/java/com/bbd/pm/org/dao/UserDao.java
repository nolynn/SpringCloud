package com.bbd.pm.org.dao;

import com.bbd.pm.common.entities.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    boolean addDept(User dept);

    User findById(String id);

    List<User> findAll();
}
