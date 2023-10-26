package com.example.resourcium_optima;

import java.io.*;

import com.example.resourcium_optima.config.Connection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "index.jsp", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "hello word from main servlet ";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {

            System.out.println(message);

        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            e.printStackTrace();
        }
    }
    public void destroy() {
    }
}