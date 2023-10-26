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
            em.getTransaction().begin();
                user.addEquipement(equipment);
                equipment.addUser(user);
            em.persist(user);
            em.persist(equipment);
            em.getTransaction().commit();
    }

    public List<Equipement> getAllEquipments(){
        TypedQuery<Equipement> q = em.createQuery("select e from Equipement e", Equipement.class);
        List<Equipement> allEquipments = q.getResultList();
        return allEquipments;
    }
    public Equipement FindEquipementById(long id){
        return em.find(Equipement.class, id);
    }
}
