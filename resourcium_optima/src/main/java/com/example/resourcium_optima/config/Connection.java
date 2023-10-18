package com.example.resourcium_optima.config;

import com.example.resourcium_optima.entities.*;
import com.example.resourcium_optima.entities.enums.State;
import com.example.resourcium_optima.entities.enums.Type;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Connection extends HttpServlet {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.jee");
    EntityManager em = emf.createEntityManager();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            em.getTransaction().begin();
            emf.close();
        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}
