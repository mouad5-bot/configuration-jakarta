package com.example.resourcium_optima.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "equipements")
@NoArgsConstructor
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;



    @Column(name = "type")
    @Getter
    @Setter
    private Type type;

    @Column(name = "dateBuyed")
    @Getter
    @Setter
    private String dateBuyed;

    @Column(name = "dateOfMaintain")
    @Getter
    @Setter
    private String dateOfMaintain;

    @Column(name = "state")
    @Getter
    @Setter
    private State state;

    public Equipement(String name, Type type, String dateBuyed, String dateOfMaintain, State state) {
        this.name = name;
        this.type = type;
        this.dateBuyed = dateBuyed;
        this.dateOfMaintain = dateOfMaintain;
        this.state = state;
    }
}
