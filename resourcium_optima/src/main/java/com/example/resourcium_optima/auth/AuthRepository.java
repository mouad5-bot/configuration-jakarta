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
    }

    public Optional<User> checkDataInDb(String email, String password) {
       try{
           User user = em.createQuery("SELECT u FROM User u WHERE u.email = :email AND u.password = :password", User.class)
                   .setParameter("password", password)
                   .setParameter("email", email)
                   .getSingleResult();

           return Optional.ofNullable(user);

       } catch (Exception e) {
           return Optional.empty();
       }
    }
}
