package com.example.resourcium_optima.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Access(AccessType.FIELD)
@NoArgsConstructor
public class Employee {
    @Id
    @Column(name = "id")
    private int id;

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

    @Column(name = "post")
    @Getter
    @Setter
    private Post post;

    public Employee(int id, String userName, String password, String firstName, String lastName, String email, Post post) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.post = post;
    }
}
