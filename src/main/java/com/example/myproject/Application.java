package com.example.myproject;

import com.example.myproject.service.UserService;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.logging.Logger;

public class Application {

    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) throws Exception {
        Injector injector = Guice.createInjector();
        UserService userService = injector.getInstance(UserService.class);

        logger.info(userService.getInstance().toString());

        // Server server = new Server(8080);
        // // TODO how to invoke Injector and servlet
        // server.start();
        // server.join();
    }
}
