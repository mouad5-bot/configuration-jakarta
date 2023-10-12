package com.example.resourcium_optima.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "equipement")
@NoArgsConstructor
public class Equipement {
    @Id
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
    private Date dateBuyed;

    @Column(name = "dateOfMaintain")
    @Getter
    @Setter
    private Date dateOfMaintain;

    @Column(name = "state")
    @Getter
    @Setter
    private State state;

    public Equipement(int id, String name, Type type, Date dateBuyed, Date dateOfMaintain, State state) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.dateBuyed = dateBuyed;
        this.dateOfMaintain = dateOfMaintain;
        this.state = state;
    }
}
