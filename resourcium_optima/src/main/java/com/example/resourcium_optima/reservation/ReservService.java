package com.example.resourcium_optima.reservation;

import com.example.resourcium_optima.entities.Equipement;
import com.example.resourcium_optima.entities.User;

public class ReservService {
    ReservRepo reservRepo = new ReservRepo();
    public void check(User user, long id){
        Equipement equipement = reservRepo.FindEquipementById(id);
        reservRepo.reserve(user, equipement);
    }
}
