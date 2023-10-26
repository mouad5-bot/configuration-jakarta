package com.example.resourcium_optima.auth;

import com.example.resourcium_optima.entities.Role;
import com.example.resourcium_optima.entities.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthServiceTest {
    private AuthService authService;

    private AuthRepository authRepository;
    @BeforeEach
    void beforeEach(){
        authService = new AuthService();
    }
    @Test
    void whenFirstNameIsNullThenThrowError() {
        User user = new User(null, "testLastName", "test@email.com", "testPassword");
        Role role = new Role("ROLE_ADMIN");

        assertThrows(IllegalArgumentException.class, () -> authService.register(user, role));
    }
    @Test
    void whenValidDataThenShouldNotThrowError() {
        User user = new User("testFirstName", "testLastName", "test@email.com", "testPassword");
        Role role = new Role("ROLE_ADMIN");

        assertDoesNotThrow(() -> authService.register(user, role));
    }

    @Test
    void login() {
    }
}