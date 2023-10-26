package com.example.resourcium_optima.auth;

import com.example.resourcium_optima.config.Connection;
import com.example.resourcium_optima.entities.Role;
import com.example.resourcium_optima.entities.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.mindrot.jbcrypt.BCrypt;

import java.io.IOException;
public class RegisterServlet extends HttpServlet {
    private AuthService authService = new AuthService();
    private AuthRepository authRepository = new AuthRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = new User();
        Role role = new Role("employee");

        String psw = req.getParameter("password");
        String hashedPassword = HashPassword.hashPassword(psw);

        user.setFirstName(req.getParameter("fname"));
        user.setLastName(req.getParameter("lname"));
        user.setEmail(req.getParameter("email"));
        user.setPassword(hashedPassword);
        user.setRole(role);

        authService.register(user, role);

        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }


}
