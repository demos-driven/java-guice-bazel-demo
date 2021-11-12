package com.example.myproject.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class User {

    private Integer userId;

    private String userName;

    private String email;

    public User withUserId(Integer userId) {
        setUserId(userId);
        return this;
    }

    public User withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    public User withUserEmail(String email) {
        setEmail(email);
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
