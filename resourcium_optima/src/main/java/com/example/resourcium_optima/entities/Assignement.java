package com.example.resourcium_optima.entities;

import jakarta.persistence.*;
//import jdk.jfr.ContentType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "assignments")
@Access(AccessType.FIELD)
@NoArgsConstructor
public class Assignement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

//    @ManyToOne
//    @Column(name = "equipement")
//    @Getter
//    @Setter
//    private Equipement equipement;
//
//    @ManyToOne
//    @Column(name = "employee")
//    @Getter
//    @Setter
//    private Employee employee;
//
//    public Assignement(Equipement equipement, Employee employee) {
//        this.equipement = equipement;
//        this.employee = employee;
//    }

    public Assignement(int id){
        this.id = id;
    }
}
