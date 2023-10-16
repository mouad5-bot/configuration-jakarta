package com.example.resourcium_optima;

import java.io.*;

import com.example.resourcium_optima.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;


    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.jee");
    EntityManager em = emf.createEntityManager();


    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {

            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + message + "</h1>");
            out.println("</body></html>");
            this.data();
        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            e.printStackTrace();
        }
    }

    public void data() {

        em.getTransaction().begin();

        Employee employee = new Employee("MFifel", "test123", "mouad", "fifel", "mfifel@gail.com", Post.CHEF_PROJECT);
        Departement departement = new Departement("math", "this is description", "john" );
        Equipement equipement = new Equipement("dell", Type.COMPUTERS, "05/11/2023",  "08/08/2022", State.AVAILABLE);
        Assignement assignement = new Assignement(1 );
        Task task = new Task("this is task des", "20/12/2021", "xyz" );

        //Employee employee = new Employee();
//        Departement departement = new Departement();
//        Equipement equipement = new Equipement();
//        Assignement assignement = new Assignement();
//        Task task = new Task();

        em.persist(employee);
        em.persist(departement);
        em.persist(equipement);
        em.persist(assignement);
        em.persist(task);

        em.getTransaction().commit();
        emf.close();
    }
    public void destroy() {
    }
}