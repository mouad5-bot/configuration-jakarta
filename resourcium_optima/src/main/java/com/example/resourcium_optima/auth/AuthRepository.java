package com.example.resourcium_optima.auth;

import com.example.resourcium_optima.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Optional;

public class AuthRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.jee");
    private EntityManager em = emf.createEntityManager();

    public void save(User user){
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    public Optional<User> checkDataOfLoginInDb(String email, String password) {

      return  em.createQuery("SELECT u FROM User u WHERE u.email = :email AND u.password = :password", User.class)
                   .setParameter("password", password)
                   .setParameter("email", email)
                   .getResultStream().findAny();


    }
}
