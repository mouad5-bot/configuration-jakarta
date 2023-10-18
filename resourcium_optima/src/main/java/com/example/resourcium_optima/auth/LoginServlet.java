package com.example.resourcium_optima.auth;

import com.example.resourcium_optima.entities.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

public class LoginServlet extends HttpServlet {
    AuthService authService = new AuthService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/auth/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            Optional<User> user = authService.login(email, password);

            if (user.isPresent()){
                req.getRequestDispatcher("/home.jsp").forward(req, resp);
            }else {
                resp.sendRedirect("/login.py");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
