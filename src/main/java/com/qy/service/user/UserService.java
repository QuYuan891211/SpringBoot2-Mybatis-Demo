package com.qy.service.user;

import com.github.pagehelper.PageInfo;
import com.qy.model.UserDomain;

public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
