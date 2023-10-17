package com.example.resourcium_optima;

import java.io.*;

import com.example.resourcium_optima.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
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

        Role role = new Role("admin");

        User user = new User("MFifel", "test123", "mouad", "fifel", "mfifel@gail.com");
        User user2 = new User("MFifel2", "test123", "mouad2", "fifel2", "mfifel@gail.com");

        Task task1 = new Task("this is task des1", "20/12/2021", "xyz1" );
        task1.setUser(user);
        user.addTask(task1);

        Task task2 = new Task("this is task des2", "21/12/2021", "xyz2" );
        task2.setUser(user);
        user.addTask(task2);

        user.setRole(role);
        role.addUser(user);

        user2.setRole(role);
        role.addUser(user2);


        Equipement pc = new Equipement("dell", Type.COMPUTERS, "05/11/2023",  "08/08/2022", State.AVAILABLE);
        Equipement usb = new Equipement("usb", Type.COMPUTERS, "05/11/2023",  "08/08/2022", State.AVAILABLE);

        user.addEquipement(pc);
        user2.addEquipement(pc);
        pc.addUser(user);
        pc.addUser(user2);

        user.addEquipement(usb);
        user2.addEquipement(usb);
        usb.addUser(user);
        usb.addUser(user2);


        em.persist(user);
        em.persist(user2);
        em.persist(pc);
        em.persist(usb);
        em.persist(task1);
        em.persist(task2);
        em.persist(role);

        em.getTransaction().commit();
        emf.close();
    }
    public void destroy() {
    }
}