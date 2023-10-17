package com.example.resourcium_optima.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tasks")
@Access(AccessType.FIELD)
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "taskId")
    @Getter
    private int id;

    @Column(name = "description")
    @Getter
    @Setter
    private String description;

    @Column(name = "dateLimit")
    @Getter
    @Setter
    private String dateLimit;

    @Column(name = "priority")
    @Getter
    @Setter
    private String priority;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    //@ManyToOne(fetch = FetchType.LAZY)

    public Task(String description, String dateLimit, String priority) {
        this.description = description;
        this.dateLimit = dateLimit;
        this.priority = priority;
//        this.assignedEmployee = assignedEmployee;
    }

}
