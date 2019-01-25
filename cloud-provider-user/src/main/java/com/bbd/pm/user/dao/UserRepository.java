package com.bbd.pm.user.dao;

import com.bbd.pm.common.entities.user.User;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@SqlResource("dao.user")
public interface UserRepository extends BaseMapper<User> {
    void addUser(User dept);

    User findById(String id);

    List<User> findAll();
}
