package com.tutorial.apidemo.springboot.tutorial.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "assigner")
public class Assigner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assigner_id")
    private Long assignerID;

    @Column(name = "assigner_name")
    private String assignerName;
}
