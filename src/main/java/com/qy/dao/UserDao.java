package com.qy.dao;

import com.qy.model.UserDomain;

import java.util.List;

public interface UserDao {
    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}
