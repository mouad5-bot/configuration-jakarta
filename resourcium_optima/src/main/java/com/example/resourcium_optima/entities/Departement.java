package com.example.resourcium_optima.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "departements")
@NoArgsConstructor
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @Column(name = "description")
    @Getter
    @Setter
    private String description;

    @Column(name = "chefDepartement")
    @Getter
    @Setter
    private String chefDepartement;

    public Departement(String name, String description, String chefDepartement) {
        this.name = name;
        this.description = description;
        this.chefDepartement = chefDepartement;
    }
}
