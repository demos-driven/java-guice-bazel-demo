package com.example.myproject.servlet;

import com.example.myproject.service.UserService;
import com.google.inject.Guice;
import com.google.inject.Injector;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MyUserServlet extends HttpServlet {

    // @Inject
    // private UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // TODO how  can jakarta servlet auto invoke guice injector?
        Injector injector = Guice.createInjector();
        UserService userService = injector.getInstance(UserService.class);

        resp.getWriter().println(userService.getInstance());
    }
}
