package com.example.resourcium_optima.auth;

import com.example.resourcium_optima.entities.User;
import com.example.resourcium_optima.entities.Role;
import com.google.protobuf.Empty;

import java.util.Optional;

public class AuthService {

    private AuthRepository authRepository;

    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    public AuthService() {
       authRepository = new AuthRepository();
    }

    public void register(User user, Role role ) {
        registerValidation(user);
        authRepository.save(user, role);
    }

    public Optional<User> login(String email, String password) throws Exception{
        if (!loginValidation(email, password))
            throw new IllegalArgumentException("invalid inputs !");

        Optional<User> user = authRepository.fundUserByEmail(email);
        if(user.isPresent()){
            if (HashPassword.checkPassword(password, user.get().getPassword()))
                return user;
        }
        return Optional.empty();
    }

    private void registerValidation(User user) {
        if (user.getEmail() == null || user.getEmail().isEmpty()
            || user.getPassword()  == null || user.getPassword().isEmpty()
            || user.getFirstName() == null || user.getFirstName().isEmpty()
            || user.getLastName()  == null || user.getLastName().isEmpty())
        {
            throw new IllegalArgumentException("fields are required.");
        }
    }

    private boolean loginValidation(String email, String password){
         return (email != null && password != null);
    }
}
