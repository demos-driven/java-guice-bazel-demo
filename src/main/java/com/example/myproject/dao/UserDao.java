package com.example.myproject.dao;

import com.example.myproject.domain.User;
import com.google.inject.Singleton;

@Singleton
public class UserDao {

    public User getInstance() {
        return new User()
                .withUserId(1)
                .withUserName("Litong Deng")
                .withUserEmail("litong.deng@compass.com");
    }
}
