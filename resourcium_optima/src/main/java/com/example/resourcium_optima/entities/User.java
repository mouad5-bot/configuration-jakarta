package com.example.resourcium_optima.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "employees")
@Access(AccessType.FIELD)
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    @Getter
    private int id;

    @ManyToMany(mappedBy = "users")
    private final List<Equipement> equipements = new ArrayList<>();

    public List<Equipement> getEquipements() {
        return Collections.unmodifiableList(equipements);
    }
    public void addEquipement(Equipement equipement){
        equipements.add(equipement);
    }

    @Column(name = "userName")
    @Getter
    @Setter
    private String userName;

    @Column(name = "password")
    @Getter
    @Setter
    private String password;

    @Column(name = "firstName")
    @Getter
    @Setter
    private String firstName;

    @Column(name = "lastName")
    @Getter
    @Setter
    private String lastName;

    @Column(name = "email")
    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "roleId")
    private Role role;


    @OneToMany(mappedBy = "user")
    private List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return Collections.unmodifiableList(tasks);
    }
    public void addTask(Task task){
        tasks.add(task);
    }

    public User(String userName, String password, String firstName, String lastName, String email) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
