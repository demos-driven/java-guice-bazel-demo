package com.example.myproject;

import com.example.myproject.servlet.MyHtmlServlet;
import com.example.myproject.servlet.MyUserServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Application {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler handler = new ServletContextHandler(server,
                "/", ServletContextHandler.SESSIONS);

        handler.addServlet(MyHtmlServlet.class, "*.html");
        handler.addServlet(MyUserServlet.class, "/api/v1/user");

        server.start();
    }

}
