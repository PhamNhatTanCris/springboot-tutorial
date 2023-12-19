package com.tutorial.apidemo.springboot.tutorial.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_id")
    private Long managerId;

    @Column(name = "manager_name")
    private String managerName;


}
