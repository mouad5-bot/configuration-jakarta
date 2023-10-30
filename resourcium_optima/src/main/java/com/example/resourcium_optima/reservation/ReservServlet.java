package com.example.resourcium_optima.reservation;

import com.example.resourcium_optima.entities.Equipement;
import com.example.resourcium_optima.entities.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

public class ReservServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ReservRepo reservRepo = new ReservRepo();
        List<Equipement> allEquipement = reservRepo.getAllEquipments();
        req.setAttribute("allEquipement", allEquipement);
        req.getRequestDispatcher("landingPage.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        User loggedInUser = (User) session.getAttribute("user");

        ReservService reservService = new ReservService();

        if (loggedInUser != null){
            int equipment = Integer.parseInt(req.getParameter("reservationRO"));

            reservService.check( loggedInUser, equipment);

            ReservRepo reservRepo = new ReservRepo();
            List<Equipement> allEquipments = reservRepo.getAllEquipments();
            req.setAttribute("equipments", allEquipments);

            req.getRequestDispatcher("landingPage.jsp").forward(req, resp);
        }else{
            req.setAttribute("error", "You are not logged in !!!");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
