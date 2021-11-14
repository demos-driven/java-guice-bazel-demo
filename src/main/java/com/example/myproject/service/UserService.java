package com.example.myproject.service;

import com.example.myproject.dao.UserDao;
import com.example.myproject.domain.User;
import com.example.myproject.util.deep.dir.ToolTest;
import com.google.inject.Inject;

import java.util.logging.Logger;

public class UserService {

    @Inject
    private Logger logger;

    @Inject
    private UserDao userDao;

    public User getInstance() {
        ToolTest.sayHi();
        logger.info("userService logger");
        return userDao.getInstance();
    }
}
