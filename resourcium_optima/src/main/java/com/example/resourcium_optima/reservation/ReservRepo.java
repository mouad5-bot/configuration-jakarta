package com.example.resourcium_optima.reservation;

import com.example.resourcium_optima.entities.Equipement;
import com.example.resourcium_optima.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ReservRepo {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.jee");
    private EntityManager em = emf.createEntityManager();

    public void reserve(User user, Equipement equipment){
        User userdetached = em.merge(user);
            em.getTransaction().begin();
                userdetached.addEquipement(equipment);
                equipment.addUser(userdetached);
            em.persist(userdetached);
            em.persist(equipment);
            em.getTransaction().commit();
    }

    public List<Equipement> getAllEquipments(){
        TypedQuery<Equipement> q = em.createQuery("select e from Equipement e", Equipement.class);
        List<Equipement> allEquipments = q.getResultList();
        return allEquipments;
    }
    public Equipement FindEquipementById(long id){
        em.getTransaction().begin();
        Equipement equipement = em.find(Equipement.class, id);
        em.getTransaction().commit();
        return equipement;
    }
}
