package com.example.resourcium_optima.entities;

import jakarta.persistence.*;
import jdk.jfr.ContentType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "assignment")
@Access(AccessType.FIELD)
@NoArgsConstructor
public class Assignement {
    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @Column(name = "equipement")
    @Getter
    @Setter
    private Equipement equipement;

    @ManyToOne
    @Column(name = "employee")
    @Getter
    @Setter
    private Employee employee;

    public Assignement(int id, Equipement equipement, Employee employee) {
        this.id = id;
        this.equipement = equipement;
        this.employee = employee;
    }
}
