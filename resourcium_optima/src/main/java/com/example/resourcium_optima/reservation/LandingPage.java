package com.example.resourcium_optima.reservation;

import com.example.resourcium_optima.entities.Equipement;
import com.example.resourcium_optima.entities.User;
import com.example.resourcium_optima.entities.enums.State;
import com.example.resourcium_optima.entities.enums.Type;

public class LandingPage  {

    User user1 = new User("mo", "xyz", "e@g.c", "psw");

    Equipement equipment1 = new Equipement( "table", Type.JETABLE, "27/09/2023", "10/09/2023", State.AVAILABLE );


}
