package com.example.resourcium_optima.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.example.resourcium_optima.entities.Employee;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tasks")
@Access(AccessType.FIELD)
@NoArgsConstructor
public class Task {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    @Getter
    @Setter
    private String description;

    @Column(name = "dateLimit")
    @Getter
    @Setter
    private Date dateLimit;

    @Column(name = "priority")
    @Getter
    @Setter
    private String priority;

    //@ManyToOne(fetch = FetchType.LAZY)
    @ManyToOne()
    @Column(name = "assignedEmployee")
    @Getter
    @Setter
    private Employee assignedEmployee;

    public Task(int id, String description, Date dateLimit, String priority, Employee assignedEmployee) {
        this.id = id;
        this.description = description;
        this.dateLimit = dateLimit;
        this.priority = priority;
        this.assignedEmployee = assignedEmployee;
    }
}
