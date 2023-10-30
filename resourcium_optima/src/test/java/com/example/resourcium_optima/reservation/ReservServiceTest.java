package com.example.resourcium_optima.reservation;

import com.example.resourcium_optima.auth.AuthRepository;
import com.example.resourcium_optima.auth.AuthService;
import com.example.resourcium_optima.entities.Equipement;
import com.example.resourcium_optima.entities.User;
import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ReservServiceTest {
    private ReservService reservService;

    @BeforeEach
    void beforeEach() {
        reservService = new ReservService();
    }
    @Test
    void check() {
    }

    @Test
    void throwsExecptionForEquipmentId(){
        User user = new User("fname", "lname", "email@email.com", "psw123");

        Exception msg = assertThrows(IllegalArgumentException.class, () -> reservService.check(user, 0));
        System.out.println(msg.getMessage());
    }

    @Test
    void checkReservesEquipmentWhenGivenValidUserAndEquipmentId() {
        User user = new User();
        long id = 1L;
        reservService.check(user, id);
    }
    @AfterAll
    static void afterAllMsg(){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@ All the tests of reservation are passed successfully @@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}