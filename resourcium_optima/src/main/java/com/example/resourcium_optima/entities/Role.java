package com.example.resourcium_optima.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "roles")
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roleId")
    @Getter
    private int id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @OneToMany(mappedBy = "role")
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return Collections.unmodifiableList(users);
    }
    public void addUser(User user){
        users.add(user);
    }

    public Role(String name){
        this.name = name;
    }
}
