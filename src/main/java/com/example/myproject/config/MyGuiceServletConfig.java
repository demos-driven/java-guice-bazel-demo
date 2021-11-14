package com.example.myproject.config;

import com.example.myproject.module.MyServletModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

import java.util.logging.Logger;

public class MyGuiceServletConfig extends GuiceServletContextListener {

    @Inject
    private Logger logger;

    @Override
    protected Injector getInjector() {
        logger.info("injector create");
        return Guice.createInjector(new MyServletModule());
    }
}
