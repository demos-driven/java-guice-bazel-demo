package com.example.myproject.module;

import com.example.myproject.servlet.HtmlServlet;
import com.example.myproject.servlet.UserServlet;
import com.google.inject.servlet.ServletModule;

public class MyServletModule extends ServletModule {

    @Override
    protected void configureServlets() {
        serve("/*.html").with(HtmlServlet.class);
        serve("/api/v1/user").with(UserServlet.class);
    }
}
