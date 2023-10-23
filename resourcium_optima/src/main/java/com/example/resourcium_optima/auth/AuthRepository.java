package com.example.resourcium_optima.auth;

import com.example.resourcium_optima.entities.Role;
import com.example.resourcium_optima.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Optional;

public class AuthRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.jee");
    private EntityManager em = emf.createEntityManager();

    public void save(User user, Role role){
        em.getTransaction().begin();
        em.persist(user);
        em.persist(role);
        em.getTransaction().commit();
    }

//    public Optional<User> checkDataOfLoginInDb(String email, String password) {
//
//      return  em.createQuery("SELECT u FROM User u WHERE u.email = :email AND u.password = :password", User.class)
//                   .setParameter("password", password)
//                   .setParameter("email", email)
//                   .getResultStream().findAny();
//    }
    public Optional<User> fundUserByEmail(String email) {
      return  em.createQuery("SELECT u FROM User u WHERE u.email = :email", User.class)
                   .setParameter("email", email)
                   .getResultStream().findAny();
    }

}
