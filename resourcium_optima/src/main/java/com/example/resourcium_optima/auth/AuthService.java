package com.example.resourcium_optima.auth;

import com.example.resourcium_optima.entities.User;

import java.util.Optional;

public class AuthService {

    private AuthRepository authRepository = new AuthRepository();
    public void register(User user) {
        registerValidation(user);
        authRepository.save(user);
    }

    public Optional<User> login(String email, String password) throws Exception{
        if (!loginValidation(email, password))
            throw new IllegalArgumentException("invalid inputs !");
        return authRepository.checkDataOfLoginInDb(email, password);
    }

    private void registerValidation(User user) {
        // TODO:   validation of filds, empty
    }

    private boolean loginValidation(String email, String password){
        // TODO
        return true;
    }
}
