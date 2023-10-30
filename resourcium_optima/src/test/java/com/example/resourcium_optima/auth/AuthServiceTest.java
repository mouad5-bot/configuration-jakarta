package com.example.resourcium_optima.auth;

import com.example.resourcium_optima.entities.Role;
import com.example.resourcium_optima.entities.User;
import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.jupiter.api.AfterAll;
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
    void whenLastNameIsNullThenThrowError() {
        User user = new User("testFirstName", null, "test@email.com", "testPassword");
        Role role = new Role("ROLE_ADMIN");

        assertThrows(IllegalArgumentException.class, () -> authService.register(user, role));
    }
    @Test
    void whenEmailIsNullThenThrowError() {
        User user = new User("testFirstName", "testLastName", null, "testPassword");
        Role role = new Role("ROLE_ADMIN");

        assertThrows(IllegalArgumentException.class, () -> authService.register(user, role));
    }
    @Test
    void whenPasswordIsNullThenThrowError() {
        User user = new User("testFirstName", "testLastName", "email@test.com", null);
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
    void throwsExeptionOnLogin(){
        Exception msg = assertThrows(IllegalArgumentException.class, () -> authService.login(null, null) );
        System.out.println(msg.getMessage());
    }

    @Test
    void throwsExceptionWhenRegisterInputsAreNull(){
        User user = new User(null, null, null, null);
        Role role = new Role("employee");
        Exception msg = assertThrows( IllegalArgumentException.class, () -> authService.register(user, role) );
        System.out.println(msg.getMessage());
    }
    @Test
    void throwsExceptionWhenRegisterInputsAreEmpty(){
        User user = new User("", "", "", "");
        Role role = new Role("employee");
        Exception msg = assertThrows( IllegalArgumentException.class, () -> authService.register(user, role) );
        System.out.println(msg.getMessage());
    }

    @AfterAll
    static void afterAllMsg(){
        System.out.println(" ------------------------------------------------------------------------------");
        System.out.println(" ----------- All the tests of authentication are passed successfully ----------");
        System.out.println(" ------------------------------------------------------------------------------");
    }

}