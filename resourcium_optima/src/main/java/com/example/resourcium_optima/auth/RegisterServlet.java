package com.example.resourcium_optima.auth;

import com.example.resourcium_optima.entities.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
public class RegisterServlet extends HttpServlet {
    private AuthService authService = new AuthService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setFirstName(req.getParameter("fname"));
        user.setLastName(req.getParameter("lname"));
        user.setEmail(req.getParameter("email"));
        user.setPassword(req.getParameter("password"));

        req.getParameter("fname");
        req.getParameter("lname");
        req.getParameter("email");
        req.getParameter("password");

        authService.register(user);

        req.getRequestDispatcher("landingPage.jsp").forward(req, resp);

    }
}
