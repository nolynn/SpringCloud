package com.bbd.pm.org.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bbd.pm.common.entities.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao extends BaseMapper<User>{
    boolean addUser(User dept);

    User findById(String id);

    List<User> findAll();
}
