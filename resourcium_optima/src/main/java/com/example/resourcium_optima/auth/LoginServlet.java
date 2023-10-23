package com.example.resourcium_optima.auth;

import com.example.resourcium_optima.entities.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Optional;

public class LoginServlet extends HttpServlet {
    AuthService authService = new AuthService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            Optional<User> user = authService.login(email, password);
            //User userEntity = user.orElse(null);
            if (user.isPresent()){
                HttpSession session = req.getSession(true);
                session.setAttribute("user",user);
                req.getRequestDispatcher("landingPage.jsp").forward(req, resp);
            }else {
                req.setAttribute("error", "Email or password incorrect");
                req.getRequestDispatcher("login.jsp").forward(req, resp);
            }

        } catch (Exception e) {
            req.setAttribute("error", e.getLocalizedMessage());
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
