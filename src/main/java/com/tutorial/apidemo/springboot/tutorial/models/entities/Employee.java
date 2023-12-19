package com.tutorial.apidemo.springboot.tutorial.models.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;
    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;


}
