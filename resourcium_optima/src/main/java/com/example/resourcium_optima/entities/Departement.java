package com.example.resourcium_optima.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "departement")
@NoArgsConstructor
public class Departement {
    @Id
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

    public Departement(int id, String name, String description, String chefDepartement) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.chefDepartement = chefDepartement;
    }
}
