package com.example.resourcium_optima.reservation;

import com.example.resourcium_optima.entities.Equipement;
import com.example.resourcium_optima.entities.User;

public class ReservService {
    ReservRepo reservRepo = new ReservRepo();
    public void check(User user, long id){
        if(emptyEquipementId(id))
            throw new IllegalArgumentException("unkown equipements ");

        Equipement equipement = reservRepo.FindEquipementById(id);
        reservRepo.reserve(user, equipement);
    }

    public boolean emptyEquipementId(long id){
        return ( id < 1);
    }
}
