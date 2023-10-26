package com.example.resourcium_optima.config;

import com.example.resourcium_optima.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class Connection{
    public static void db() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.jee");
        EntityManager em = emf.createEntityManager();

        Role employee = new Role("employee");
        Role admin = new Role("admin");

        em.getTransaction().begin();
        em.persist(employee);
        em.persist(admin);
        em.getTransaction().commit();
    }
}




//
//@WebServlet(loadOnStartup = 1)
//public class Connection extends HttpServlet {
//
//    @Override
//    public void init() {
//        this.initialisationOfDatabase();
//    }
//    public void initialisationOfDatabase(){
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.jee");
//        EntityManager em = emf.createEntityManager();
//
//        Role employee = new Role("employee");
//        Role admin = new Role("admin");
//
//        em.getTransaction().begin();
//        em.persist(employee);
//        em.persist(admin);
//        em.getTransaction().commit();
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("index.jsp").forward(req, resp);
//    }
//}
