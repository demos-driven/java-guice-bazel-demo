package com.example.myproject.service;

import com.example.myproject.domain.User;
import com.example.myproject.dao.UserDao;
import com.example.myproject.util.deep.dir.ToolTest;
import com.google.inject.Inject;

public class UserService {

    @Inject
    private UserDao userDao;

    public User getInstance() {
        ToolTest.sayHi();
        return  userDao.getInstance();
    }
}
