package com.example.myproject;

import com.example.myproject.service.UserService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Application {

    public static void main(String[] args) {
        final Injector injector = Guice.createInjector();
        final UserService userService = injector.getInstance(UserService.class);

        System.out.println(userService.getInstance());
    }
}
