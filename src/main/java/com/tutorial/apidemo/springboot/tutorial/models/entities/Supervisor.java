package com.tutorial.apidemo.springboot.tutorial.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "supervisor")
public class Supervisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supervisor_id")
    private Long supervisorID;

    @Column(name = "supervisor_name")
    private String supervisorName;
}
