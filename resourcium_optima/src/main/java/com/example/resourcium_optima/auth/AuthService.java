package com.example.resourcium_optima.auth;

import com.example.resourcium_optima.entities.User;

import java.util.Optional;

public class AuthService {

    private AuthRepository authRepository = new AuthRepository();
    public void register(User user) {
        validate(user);
        authRepository.save(user);
    }

    public Optional<User> login(String email, String password) throws Exception{
        if (!validation(email, password))
            throw new IllegalArgumentException("invalid inputs !");
        return authRepository.checkDataInDb(email, password);
    }

    private void validate(User user) {
        // TODO:   validation of filds, empty
    }

    private boolean validation(String email, String password){
        // TODO
        return true;
    }
}
